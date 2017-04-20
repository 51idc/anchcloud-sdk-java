package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class InstanceEip{
    @JSONField(name = "eip_name")
    public String eipName;
    @JSONField(name = "eip_addr")
    public String eipAddr;
    @JSONField(name = "eip_id")
    public String eipId;

    public String getEipName() {
        return eipName;
    }

    public void setEipName(String eipName) {
        this.eipName = eipName;
    }

    public String getEipAddr() {
        return eipAddr;
    }

    public void setEipAddr(String eipAddr) {
        this.eipAddr = eipAddr;
    }

    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    @Override
    public String toString() {
        return "InstanceEip{" +
                "eipName='" + eipName + '\'' +
                ", eipAddr='" + eipAddr + '\'' +
                ", eipId='" + eipId + '\'' +
                '}';
    }
}
