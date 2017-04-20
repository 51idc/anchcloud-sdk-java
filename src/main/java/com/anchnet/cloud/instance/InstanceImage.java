package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class InstanceImage{
    @JSONField(name = "image_id")
    public String imageId;
    @JSONField(name = "image_name")
    public String imageName;
    @JSONField(name = "image_size")
    public Integer imageSize;
    @JSONField(name = "platform")
    public String platform;
    @JSONField(name = "processor_type")
    public String processorType;
    @JSONField(name = "os_family")
    public String osFamily;
    @JSONField(name = "provider")
    public String provider;
    @JSONField(name = "is_shared")
    public Integer isShared;
    @JSONField(name = "default_user")
    public String defaultUser;
    @JSONField(name = "visibility")
    public String visibility;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getOsFamily() {
        return osFamily;
    }

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getIsShared() {
        return isShared;
    }

    public void setIsShared(Integer isShared) {
        this.isShared = isShared;
    }

    public String getDefaultUser() {
        return defaultUser;
    }

    public void setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "InstanceImage{" +
                "imageId='" + imageId + '\'' +
                ", imageName='" + imageName + '\'' +
                ", imageSize=" + imageSize +
                ", platform='" + platform + '\'' +
                ", processorType='" + processorType + '\'' +
                ", osFamily='" + osFamily + '\'' +
                ", provider='" + provider + '\'' +
                ", isShared=" + isShared +
                ", defaultUser='" + defaultUser + '\'' +
                ", visibility='" + visibility + '\'' +
                '}';
    }
}

