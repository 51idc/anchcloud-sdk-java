package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/13.
 */
public class InstanceConfig {
    @JSONField(name = "cpu")
    public Integer cpu;
    @JSONField(name = "memory")
    public List<Integer> memory;

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public List<Integer> getMemory() {
        return memory;
    }

    public void setMemory(List<Integer> memory) {
        this.memory = memory;
    }
}
