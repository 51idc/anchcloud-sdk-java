package com.anchnet.cloud.security_group;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/13.
 */
public class DescribeSecurityGroupResponse {
    @JSONField(name = "total_count")
    public Integer totalCount;
    @JSONField(name = "security_groups")
    public List<SecurityGroupsResponse> securityGroups;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<SecurityGroupsResponse> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupsResponse> securityGroups) {
        this.securityGroups = securityGroups;
    }
}
