package com.anchnet.cloud.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/8.
 */
public class Error {
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "message")
    public String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
