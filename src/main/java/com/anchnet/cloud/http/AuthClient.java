package com.anchnet.cloud.http;

import com.alibaba.fastjson.JSON;
import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.anchnet.cloud.utils.Base64Helper;
import com.squareup.okhttp.*;

import java.io.IOException;
import java.util.Map;

/**
 * Created by liangs on 17/3/7.
 */
class AuthClient {

    protected String token = "";
    protected String authAddress = "";
    protected String apiKey = "";
    protected String secretKey = "";

    protected  AuthClient(String apiKey,String secretKey,String endPoint) throws AuthCloudHttpException{
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        this.authAddress = endPoint;
        this.resetToken();
    }

    protected synchronized  void resetToken() throws AuthCloudHttpException {
        try {
            Response oAuthresponse = null;
            OkHttpClient okHttpClient = new OkHttpClient();
            String authorization = "Basic" + " " + Base64Helper.encode(this.apiKey + ":" + this.secretKey, "UTF-8");
            for (int i=0;i<3;i++) {
                RequestBody requestBody = new FormEncodingBuilder().add("grant_type", "client_credentials").build();
                Request request = new Request.Builder().addHeader("Authorization",authorization).post(requestBody).url(this.authAddress).build();
                oAuthresponse = okHttpClient.newCall(request).execute();
                if (oAuthresponse.code() == 200) {
                    break;
                }
            }
            if (oAuthresponse.code() != 200) {
                throw new IOException("OAuth2 Error " + oAuthresponse.body().string());
            }
            String authJson = oAuthresponse.body().string();
            Map<String,Object> map = JSON.parseObject(authJson, Map.class);
            this.token = (String) map.get("token_type") + " " + (String) map.get("access_token");
        } catch (Exception e) {
            new AuthCloudHttpException(e.getMessage());
        }

    }

    public void setAuthAddress(String authAddress) {
        this.authAddress = authAddress;
    }
}
