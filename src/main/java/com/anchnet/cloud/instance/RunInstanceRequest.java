package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.InstanceLoginMode;
import com.anchnet.cloud.common.InstanceType;
import com.anchnet.cloud.common.VolumeType;
import com.anchnet.cloud.common.VxnetType;

import javax.security.auth.spi.LoginModule;
import java.util.List;

/**
 * Created by liangs on 17/3/8.
 */
public class RunInstanceRequest {
    @JSONField(name = "instance")
    public RunInstance instance;
    @JSONField(name = "volumes")
    public List<RunInstanceVolume> volumes;
    @JSONField(name = "eip")
    public RunInstanceEip eip;
    @JSONField(name = "vxnet")
    public RunInstanceVxnet vxnet;
    @JSONField(serialize = false)
    public String zone;
    @JSONField(name = "order")
    public RunInstanceOrder order = new RunInstanceOrder();

    public RunInstance getInstance() {
        return instance;
    }

    public void setInstance(RunInstance instance) {
        this.instance = instance;
    }

    public List<RunInstanceVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<RunInstanceVolume> volumes) {
        this.volumes = volumes;
    }

    public RunInstanceEip getEip() {
        return eip;
    }

    public void setEip(RunInstanceEip eip) {
        this.eip = eip;
    }

    public RunInstanceVxnet getVxnet() {
        return vxnet;
    }

    public void setVxnet(RunInstanceVxnet vxnet) {
        this.vxnet = vxnet;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public RunInstanceOrder getOrder() {
        return order;
    }

    public void setOrder(RunInstanceOrder order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "RunInstanceRequest{" +
                "instance=" + instance +
                ", volumes=" + volumes +
                ", eip=" + eip +
                ", vxnet=" + vxnet +
                ", zone='" + zone + '\'' +
                ", order=" + order +
                '}';
    }
}


