package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.VxnetType;

/**
 * Created by liangs on 17/3/13.
 */
public class RunInstanceVxnet{
    @JSONField(name = "vxnet_name")
    public String vxnetName;
    @JSONField(name = "vxnet_type")
    public VxnetType vxnetType;

    public String getVxnetName() {
        return vxnetName;
    }

    public void setVxnetName(String vxnetName) {
        this.vxnetName = vxnetName;
    }

    public VxnetType getVxnetType() {
        return vxnetType;
    }

    public void setVxnetType(VxnetType vxnetType) {
        this.vxnetType = vxnetType;
    }

    @Override
    public String toString() {
        return "RunInstanceVxnet{" +
                "vxnetName='" + vxnetName + '\'' +
                ", vxnetType=" + vxnetType +
                '}';
    }
}
