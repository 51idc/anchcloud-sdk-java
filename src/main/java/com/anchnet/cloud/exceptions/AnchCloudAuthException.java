package com.anchnet.cloud.exceptions;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.Map;

/**
 * Created by liangs on 17/3/6.
 */
public class AnchCloudAuthException extends IOException {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AnchCloudAuthException(String code, String message) {
        super(message);
        this.code = code;
    }

    public AnchCloudAuthException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
