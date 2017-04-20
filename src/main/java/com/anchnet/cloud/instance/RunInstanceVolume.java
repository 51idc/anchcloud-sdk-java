package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.VolumeType;

/**
 * Created by liangs on 17/3/13.
 */
public class RunInstanceVolume {
    @JSONField(name = "volume_name")
    public String volumeName;
    @JSONField(name = "size")
    public Integer size;
    @JSONField(name = "volume_type")
    public VolumeType volumeType;

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public VolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public String toString() {
        return "RunInstanceVolume{" +
                "volumeName='" + volumeName + '\'' +
                ", size=" + size +
                ", volumeType=" + volumeType +
                '}';
    }
}
