package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class InstanceSecurityGroup{
    @JSONField(name = "secruity_group_id")
    public String secruityGroupId;
    @JSONField(name = "secruity_group_name")
    public String secruityGroupName;
    @JSONField(name = "is_default")
    public Integer isDefault;

    public String getSecruityGroupId() {
        return secruityGroupId;
    }

    public void setSecruityGroupId(String secruityGroupId) {
        this.secruityGroupId = secruityGroupId;
    }

    public String getSecruityGroupName() {
        return secruityGroupName;
    }

    public void setSecruityGroupName(String secruityGroupName) {
        this.secruityGroupName = secruityGroupName;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "InstanceSecurityGroup{" +
                "secruityGroupId='" + secruityGroupId + '\'' +
                ", secruityGroupName='" + secruityGroupName + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }
}
