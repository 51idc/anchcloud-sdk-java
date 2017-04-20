package com.anchnet.cloud.exceptions;

import java.io.IOException;

/**
 * Created by liangs on 17/3/8.
 */
public class AuthCloudHttpException extends IOException {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public AuthCloudHttpException(String message) {
        super(message);
    }

    public AuthCloudHttpException(int code, String message) {
        super(message);
        this.code = code;
    }

    public AuthCloudHttpException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
