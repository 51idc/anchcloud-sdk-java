package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/9.
 */
public class ModifyInstanceRequest {
    @JSONField(name = "instances")
    public List<String> instances;
    @JSONField(name = "instance_name")
    public String instanceName;
    @JSONField(name = "description")
    public String description;
    @JSONField(serialize = false)
    public String zone;

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
