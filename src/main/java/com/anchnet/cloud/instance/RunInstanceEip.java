package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class RunInstanceEip {
    @JSONField(name = "bandwidth")
    public Integer bandwidth;
    @JSONField(name = "eip_name")
    public String eipName;
    @JSONField(name = "count")
    public Integer count = 1;
    @JSONField(name = "eip_group")
    public String eipGroup;

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getEipName() {
        return eipName;
    }

    public void setEipName(String eipName) {
        this.eipName = eipName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getEipGroup() {
        return eipGroup;
    }

    public void setEipGroup(String eipGroup) {
        this.eipGroup = eipGroup;
    }

    @Override
    public String toString() {
        return "RunInstanceEip{" +
                "bandwidth=" + bandwidth +
                ", eipName='" + eipName + '\'' +
                ", count=" + count +
                ", eipGroup='" + eipGroup + '\'' +
                '}';
    }
}
