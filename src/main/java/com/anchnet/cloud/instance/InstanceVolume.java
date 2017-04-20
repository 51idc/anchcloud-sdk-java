package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.VolumeType;

/**
 * Created by liangs on 17/3/13.
 */
public class InstanceVolume{
    @JSONField(name = "volume_name")
    public String volumeName;
    @JSONField(name = "volume_type")
    public VolumeType volumeType;
    @JSONField(name = "volume_id")
    public String volumeId;
    @JSONField(name = "size")
    public Integer size;

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

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "InstanceVolume{" +
                "volumeName='" + volumeName + '\'' +
                ", volumeType=" + volumeType +
                ", volumeId='" + volumeId + '\'' +
                ", size=" + size +
                '}';
    }
}

