package com.anchnet.cloud.security_group;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.utils.CommonHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liangs on 17/3/13.
 */
public class DescribeSecurityGroupRequest {
    @JSONField(name = "zone")
    public String zone;
    @JSONField(name = "is_default")
    public String isDefault;
    @JSONField(name = "search_word")
    public String searchWord;
    @JSONField(name = "offset")
    public Integer offset;
    @JSONField(name = "limit")
    public Integer limit;
    @JSONField(name = "security_groups")
    public List<String> securityGroups;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
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

    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap();
        map.put("security_groups", CommonHelper.formatList(this.securityGroups));
        map.put("is_default", this.isDefault);
        map.put("limit", this.limit == null ? "" : this.limit + "");
        map.put("offset", this.offset == null ? "" : this.offset + "");
        map.put("search_word", this.searchWord);
        return map;
    }

    @Override
    public String toString() {
        return "DescribeSecurityGroupRequest{" +
                "zone='" + zone + '\'' +
                ", isDefault='" + isDefault + '\'' +
                ", searchWord='" + searchWord + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}
