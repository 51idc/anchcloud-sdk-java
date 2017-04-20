package com.anchnet.cloud.instance;

import com.anchnet.cloud.common.InstanceType;
import com.anchnet.cloud.utils.CommonHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liangs on 17/3/8.
 */
public class DescribeInstanceRequest {
    public List<String> instances;
    public String imageId;
    public InstanceType instanceType = InstanceType.PERFORMANCE;
    public List<String> status;
    public String searchWord;
    public Integer offset;
    public Integer limit;
    public String zone;

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public InstanceType getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap();
        map.put("instances", CommonHelper.formatList(this.instances));
        map.put("image", this.imageId);
        map.put("instance_type", this.instanceType.name());
        map.put("status", CommonHelper.formatList(this.status));
        map.put("limit", this.limit == null ? "" : this.limit + "");
        map.put("offset", this.offset == null ? "" : this.offset + "");
        map.put("search_word", this.searchWord);
        return map;
    }

    @Override
    public String toString() {
        return "DescribeInstanceRequest{" +
                "instances=" + instances +
                ", imageId='" + imageId + '\'' +
                ", instanceType=" + instanceType +
                ", status=" + status +
                ", searchWord='" + searchWord + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                ", zone='" + zone + '\'' +
                '}';
    }
}
