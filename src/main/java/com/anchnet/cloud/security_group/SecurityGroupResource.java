package com.anchnet.cloud.security_group;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class SecurityGroupResource {
    @JSONField(name = "resource_name")
    public String resourceName;
    @JSONField(name = "resource_type")
    public String resourceType;
    @JSONField(name = "resource_id")
    public String resourceId;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
