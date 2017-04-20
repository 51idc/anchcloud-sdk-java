package com.anchnet.cloud.security_group;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/13.
 */
public class SecurityGroupsResponse {
    @JSONField(name = "security_group_id")
    public String securityGroupId;
    @JSONField(name = "security_group_name")
    public String securityGroupName;
    @JSONField(name = "is_applied")
    public Integer isApplied;
    @JSONField(name = "is_default")
    public Integer isDefault;
    @JSONField(name = "create_time")
    public String createTime;
    @JSONField(name = "resources")
    public List<SecurityGroupResource> resources;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public Integer getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<SecurityGroupResource> getResources() {
        return resources;
    }

    public void setResources(List<SecurityGroupResource> resources) {
        this.resources = resources;
    }
}
