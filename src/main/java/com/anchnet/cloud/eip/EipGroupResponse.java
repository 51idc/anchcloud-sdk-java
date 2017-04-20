package com.anchnet.cloud.eip;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class EipGroupResponse {
    @JSONField(name = "eip_group_id")
    public String eipGroupId;
    @JSONField(name = "eip_group_name")
    public String eipGroupName;

    public String getEipGroupId() {
        return eipGroupId;
    }

    public void setEipGroupId(String eipGroupId) {
        this.eipGroupId = eipGroupId;
    }

    public String getEipGroupName() {
        return eipGroupName;
    }

    public void setEipGroupName(String eipGroupName) {
        this.eipGroupName = eipGroupName;
    }
}
