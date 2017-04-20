package com.anchnet.cloud.volume;

import com.anchnet.cloud.common.VolumeType;
import com.anchnet.cloud.utils.CommonHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liangs on 17/3/10.
 */
public class DescribeVolumeRequest {
    public String zone;
    public List<String> volumes;
    public List<String> status;
    public VolumeType volumeType;
    public Integer offset;
    public Integer limit;
    public String searchWord;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<String> volumes) {
        this.volumes = volumes;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public VolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap();
        map.put("volumes", CommonHelper.formatList(this.volumes));
        map.put("status", CommonHelper.formatList(this.status));
        map.put("volume_type", this.volumeType.name());
        map.put("limit", this.limit == null ? "" : this.limit + "");
        map.put("offset", this.offset == null ? "" : this.offset + "");
        map.put("search_word", this.searchWord);
        return map;
    }
}
