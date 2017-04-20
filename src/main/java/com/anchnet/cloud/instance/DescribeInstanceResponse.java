package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.InstanceType;
import com.anchnet.cloud.common.VolumeType;
import com.anchnet.cloud.common.VxnetType;

import java.util.List;

/**
 * Created by liangs on 17/3/8.
 */
public class DescribeInstanceResponse {
    @JSONField(name = "instances")
    public List<DescribeInstance> instances;
    @JSONField(name = "total_count")
    public Integer totalCount;

    public List<DescribeInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<DescribeInstance> instances) {
        this.instances = instances;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "DescribeInstanceResponse{" +
                "instances=" + instances +
                ", totalCount=" + totalCount +
                '}';
    }
}







