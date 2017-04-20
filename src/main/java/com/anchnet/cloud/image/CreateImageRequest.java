package com.anchnet.cloud.image;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/10.
 */
public class CreateImageRequest {
    @JSONField(name = "image_name")
    public String imageName;
    @JSONField(name = "instance")
    public String instance;
    @JSONField(serialize = false)
    public String zone;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
