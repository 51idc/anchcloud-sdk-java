package com.anchnet.cloud.volume;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.VolumeType;

/**
 * Created by liangs on 17/3/13.
 */
public class DescribeVolume {
    @JSONField(name = "volume_id")
    public String volumeId;
    @JSONField(name = "volume_name")
    public String volumeName;
    @JSONField(name = "volume_type")
    public VolumeType volumeType;
    @JSONField(name = "description")
    public String description;
    @JSONField(name = "size")
    public Integer size;
    @JSONField(name = "status")
    public String status;
    @JSONField(name = "transition_status")
    public String transitionStatus;
    @JSONField(name = "create_time")
    public String createTime;
    @JSONField(name = "status_time")
    public String statusTime;
    @JSONField(serialize = false)
    public String zone;

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public VolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransitionStatus() {
        return transitionStatus;
    }

    public void setTransitionStatus(String transitionStatus) {
        this.transitionStatus = transitionStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
