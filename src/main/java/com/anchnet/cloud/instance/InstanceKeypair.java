package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class InstanceKeypair{
    @JSONField(name = "keypair_id")
    public String keypairId;
    @JSONField(name = "keypair_name")
    public String keypairName;

    public String getKeypairId() {
        return keypairId;
    }

    public void setKeypairId(String keypairId) {
        this.keypairId = keypairId;
    }

    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    @Override
    public String toString() {
        return "InstanceKeypair{" +
                "keypairId='" + keypairId + '\'' +
                ", keypairName='" + keypairName + '\'' +
                '}';
    }
}

