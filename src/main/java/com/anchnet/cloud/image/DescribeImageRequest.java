package com.anchnet.cloud.image;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.utils.CommonHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liangs on 17/3/10.
 */
public class DescribeImageRequest {
    public List<String> imageIds;
    public List<String> status;
    public Integer offset;
    public Integer limit;
    public String visibility;
    public String osFamily;
    public String processorType;
    public String searchWord;
    public String provider;
    public String zone;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<String> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
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

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getOsFamily() {
        return osFamily;
    }

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap();
        map.put("images", CommonHelper.formatList(this.imageIds));
        map.put("status", CommonHelper.formatList(this.status));
        map.put("provider", this.provider);
        map.put("visibility", this.visibility);
        map.put("os_family", this.osFamily);
        map.put("processor_type", this.processorType);
        map.put("limit", this.limit == null ? "" : this.limit + "");
        map.put("offset", this.offset == null ? "" : this.offset + "");
        map.put("search_word", this.searchWord);
        return map;
    }
}
