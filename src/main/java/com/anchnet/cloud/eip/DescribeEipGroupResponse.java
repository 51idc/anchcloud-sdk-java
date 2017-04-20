package com.anchnet.cloud.eip;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/13.
 */
public class DescribeEipGroupResponse {
    @JSONField(name = "eip_groups")
    public List<EipGroupResponse> eipGroups;
    @JSONField(name = "total_count")
    public Integer totalCount;

    public List<EipGroupResponse> getEipGroups() {
        return eipGroups;
    }

    public void setEipGroups(List<EipGroupResponse> eipGroups) {
        this.eipGroups = eipGroups;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}

