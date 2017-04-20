package com.anchnet.cloud.volume;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.VolumeType;

import java.util.List;

/**
 * Created by liangs on 17/3/10.
 */
public class DescribeVolumeResponse {
    @JSONField(name = "volumes")
    public List<DescribeVolume> volumes;
    @JSONField(name = "total_count")
    public Integer totalCount;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<DescribeVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<DescribeVolume> volumes) {
        this.volumes = volumes;
    }
}
