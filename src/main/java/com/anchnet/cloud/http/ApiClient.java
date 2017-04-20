package com.anchnet.cloud.http;

import com.alibaba.fastjson.JSON;
import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.google.common.base.Strings;
import com.squareup.okhttp.*;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * Created by liangs on 17/3/3.
 */
public abstract class ApiClient {

    private OkHttpClient okHttpClient = null;
    private AuthClient authClient;
    private int connectTimeOut = 10;
    protected String endPoint = "https://openapi.51idc.com/v2/oauth2/token";
    protected Logger LOGGER = Logger.getLogger(ApiClient.class);

    public ApiClient(String apiKey, String secretKey) throws AuthCloudHttpException {
        this.authClient = new AuthClient(apiKey, secretKey,this.endPoint);
        this.okHttpClient = new OkHttpClient();
        AuthAdapter authAdapter = new AuthAdapter(this.authClient);
        this.okHttpClient.setAuthenticator(authAdapter);
        this.okHttpClient.setConnectTimeout(connectTimeOut, TimeUnit.SECONDS);
    }

    public ApiClient(String apiKey, String secretKey,int connectTimeOut) throws AuthCloudHttpException {
        this(apiKey, secretKey);
        this.okHttpClient.setConnectTimeout(connectTimeOut,TimeUnit.SECONDS);
    }

    public ApiClient(String apiKey, String secretKey,int connectTimeOut,String endPoint) throws AuthCloudHttpException {
        this(apiKey, secretKey);
        this.okHttpClient.setConnectTimeout(connectTimeOut,TimeUnit.SECONDS);
        this.authClient.setAuthAddress(endPoint);
    }

    protected <T> T doGetRequest(String url, Map<String, String> query, Class<T> tClass) throws Exception {
        StringBuffer queryParams = new StringBuffer();
        if (null == query) {
            query = new HashMap<String, String>();
        }
        for (String key : query.keySet()) {
            if (!Strings.isNullOrEmpty(query.get(key))) {
                queryParams.append(key).append("=").append(query.get(key)).append("&");
            }
        }
        Request request = new Request.Builder().url(url + "?" + queryParams.toString())
                .addHeader("Authorization", authClient.token).get().build();
        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();
        LOGGER.info("GET " + " " +request.urlString() + " " + response.code() + " " + responseBody);
        if (response.code() >= 300) {
            throw new AuthCloudHttpException(response.code(), responseBody);
        }
        T res = JSON.parseObject(responseBody, tClass);
        return res;
    }

    protected <T> T doPostRequest(String url, Object body, Class<T> tClass) throws Exception {
        String bodyContext = JSON.toJSONString(body);
        LOGGER.info("body: " + bodyContext);
        Request request = new Request.Builder().url(url).post(RequestBody.create(MediaType.parse("application/json"), bodyContext))
                .addHeader("Authorization", authClient.token).build();
        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();
        LOGGER.info("POST " + " " + request.urlString() + " " + response.code() + " " + responseBody);
        if (response.code() >= 300) {
            throw new AuthCloudHttpException(response.code(), responseBody);
        }
        T res = JSON.parseObject(responseBody, tClass);
        return res;
    }

    protected <T> T doPutRequest(String url, Object body, Class<T> tClass) throws Exception {
        String bodyContext = JSON.toJSONString(body);
        Request request = new Request.Builder().url(url).put(RequestBody.create(MediaType.parse("application/json"), bodyContext))
                .addHeader("Authorization", authClient.token).build();
        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();
        LOGGER.info("PUT " + " " + request.urlString() + " " + response.code() + " " + responseBody);
        if (response.code() >= 300) {
            throw new AuthCloudHttpException(response.code(), responseBody);
        }
        T res = JSON.parseObject(responseBody, tClass);
        return res;
    }

    protected <T> T doDeletedRequest(String url, Map<String, String> query, Class<T> tClass) throws Exception {
        StringBuffer queryParams = new StringBuffer();
        if (null == query) {
            query = new HashMap<String, String>();
        }
        for (String key : query.keySet()) {
            if (!Strings.isNullOrEmpty(query.get(key))) {
                queryParams.append(key).append("=").append(query.get(key)).append("&");
            }
        }
        Request request = new Request.Builder().url(url + "?" + queryParams.toString())
                .addHeader("Authorization", authClient.token).delete().build();
        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();
        LOGGER.info("DELETE " + " " + url + " " + response.code() + " " + responseBody);
        if (response.code() >= 300) {
            throw new AuthCloudHttpException(response.code(), responseBody);
        }
        T res = JSON.parseObject(responseBody, tClass);
        return res;
    }

    protected int getConnectTimeOut() {
        return connectTimeOut;
    }

    protected void setConnectTimeOut(int connectTimeOut) {
        this.connectTimeOut = connectTimeOut;
        this.okHttpClient.setConnectTimeout(connectTimeOut, TimeUnit.SECONDS);
    }
}
