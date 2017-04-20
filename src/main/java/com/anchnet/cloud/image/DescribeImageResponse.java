package com.anchnet.cloud.image;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/10.
 */
public class DescribeImageResponse {
    @JSONField(name = "images")
    public List<DescribeImage> images;
    @JSONField(name = "total_count")
    public Integer totalCount;

    public List<DescribeImage> getImages() {
        return images;
    }

    public void setImages(List<DescribeImage> images) {
        this.images = images;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}

