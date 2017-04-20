package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.VxnetType;

/**
 * Created by liangs on 17/3/13.
 */
public class  InstanceVxnet{
    @JSONField(name = "vxnet_name")
    public String vxnetName;
    @JSONField(name = "vxnet_type")
    public VxnetType vxnetType;
    @JSONField(name = "vxnet_id")
    public String vxnetId;
    @JSONField(name = "nic_id")
    public String nicId;
    @JSONField(name = "private_ip")
    public String privateIp;
    @JSONField(name = "sys_type")
    public String sysType;
    @JSONField(name = "router_id")
    public String routerId;
    @JSONField(name = "network")
    public String network;

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

    public String getVxnetId() {
        return vxnetId;
    }

    public void setVxnetId(String vxnetId) {
        this.vxnetId = vxnetId;
    }

    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "InstanceVxnet{" +
                "vxnetName='" + vxnetName + '\'' +
                ", vxnetType=" + vxnetType +
                ", vxnetId='" + vxnetId + '\'' +
                ", nicId='" + nicId + '\'' +
                ", privateIp='" + privateIp + '\'' +
                ", sysType='" + sysType + '\'' +
                ", routerId='" + routerId + '\'' +
                ", network='" + network + '\'' +
                '}';
    }
}

