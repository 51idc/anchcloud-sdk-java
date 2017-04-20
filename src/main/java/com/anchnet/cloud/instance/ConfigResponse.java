package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/13.
 */
public class ConfigResponse {
    @JSONField(name = "instances")
    public List<InstanceConfig> instances;
    @JSONField(name = "bandwidth")
    public Integer bandwidth;

    public List<InstanceConfig> getInstances() {
        return instances;
    }

    public void setInstances(List<InstanceConfig> instances) {
        this.instances = instances;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
}

