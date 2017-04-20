package com.anchnet.cloud.http;

import com.squareup.okhttp.*;

import java.io.IOException;
import java.net.Proxy;

/**
 * Created by liangs on 17/3/7.
 */
public class AuthAdapter implements Authenticator {

    private AuthClient authClient;

    public AuthAdapter(AuthClient authClient) {
        this.authClient = authClient;
    }

    @Override
    public Request authenticate(Proxy proxy, Response response) throws IOException {
        System.out.println("auth begin");
        this.authClient.resetToken();
        System.out.println("auth end " + this.authClient.token);
        return response.request().newBuilder()
                .addHeader("Authorization", this.authClient.token)
                .build();
    }

    @Override
    public Request authenticateProxy(Proxy proxy, Response response) throws IOException {
        return null;
    }
}
