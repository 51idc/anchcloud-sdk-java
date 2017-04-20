package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/9.
 */
public class ResizeInstanceRequest {
    @JSONField(name = "instances")
    public List<String> instances;
    @JSONField(name = "cup")
    public Integer cpu;
    @JSONField(name = "memory")
    public Integer memory;
    @JSONField(serialize = false)
    public String zone;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "ResizeInstanceRequest{" +
                "instances=" + instances +
                ", cpu=" + cpu +
                ", memory=" + memory +
                ", zone='" + zone + '\'' +
                '}';
    }
}
