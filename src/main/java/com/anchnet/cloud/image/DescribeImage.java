package com.anchnet.cloud.image;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class DescribeImage{
    @JSONField(name = "image_id")
    public String imageId;
    @JSONField(name = "image_name")
    public String imageName;
    @JSONField(name = "description")
    public String description;
    @JSONField(name = "size")
    public Integer size;
    @JSONField(name = "processor_type")
    public String processorType;
    @JSONField(name = "platform")
    public String platform;
    @JSONField(name = "os_family")
    public String osFamily;
    @JSONField(name = "visibility")
    public String visibility;
    @JSONField(name = "provider")
    public String provider;
    @JSONField(name = "shared_account")
    public String sharedAccount;
    @JSONField(name = "recommended_type")
    public String recommendedType;
    @JSONField(name = "status")
    public String status;
    @JSONField(name = "transition_status")
    public String transitionStatus;
    @JSONField(name = "create_time")
    public String createTime;
    @JSONField(name = "default_passwd")
    public String defaultPasswd;
    @JSONField(name = "default_user")
    public String defaultUser;
    @JSONField(name = "status_time")
    public String statusTime;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOsFamily() {
        return osFamily;
    }

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSharedAccount() {
        return sharedAccount;
    }

    public void setSharedAccount(String sharedAccount) {
        this.sharedAccount = sharedAccount;
    }

    public String getRecommendedType() {
        return recommendedType;
    }

    public void setRecommendedType(String recommendedType) {
        this.recommendedType = recommendedType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransitionStatus() {
        return transitionStatus;
    }

    public void setTransitionStatus(String transitionStatus) {
        this.transitionStatus = transitionStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDefaultPasswd() {
        return defaultPasswd;
    }

    public void setDefaultPasswd(String defaultPasswd) {
        this.defaultPasswd = defaultPasswd;
    }

    public String getDefaultUser() {
        return defaultUser;
    }

    public void setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }
}

