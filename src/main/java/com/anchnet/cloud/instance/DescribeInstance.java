package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.InstanceType;

import java.util.List;

/**
 * Created by liangs on 17/3/13.
 */
public class DescribeInstance{
    @JSONField(name = "instance_id")
    public String instanceId;
    @JSONField(name = "instance_name")
    public String instanceName;
    @JSONField(name = "description")
    public String description;
    @JSONField(name = "instance_type")
    public InstanceType instanceType;
    @JSONField(name = "vcpus_current")
    public Integer vcpusCurrent;
    @JSONField(name = "memory_current")
    public Integer memoryCurrent;
    @JSONField(name = "status")
    public String status;
    @JSONField(name = "transition_status")
    public String transitionStatus;
    @JSONField(name = "create_time")
    public String createTime;
    @JSONField(name = "status_time")
    public String statusTime;
    @JSONField(name = "image")
    public InstanceImage image;
    @JSONField(name = "vxnets")
    public List<InstanceVxnet> vxnets;
    @JSONField(name = "volumes")
    public List<InstanceVolume> volumes;
    @JSONField(name = "keypair_ids")
    public List<InstanceKeypair> keypairIds;
    @JSONField(name = "security_group")
    public InstanceSecurityGroup securityGroup;
    @JSONField(name = "eip")
    public InstanceEip eip;
    @JSONField(name = "graphics_protocol")
    public String graphicsProtocol;
    @JSONField(name = "graphics_passwd")
    public String graphicsPasswd;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceType getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType;
    }

    public Integer getVcpusCurrent() {
        return vcpusCurrent;
    }

    public void setVcpusCurrent(Integer vcpusCurrent) {
        this.vcpusCurrent = vcpusCurrent;
    }

    public Integer getMemoryCurrent() {
        return memoryCurrent;
    }

    public void setMemoryCurrent(Integer memoryCurrent) {
        this.memoryCurrent = memoryCurrent;
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

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public InstanceImage getImage() {
        return image;
    }

    public void setImage(InstanceImage image) {
        this.image = image;
    }

    public List<InstanceVxnet> getVxnets() {
        return vxnets;
    }

    public void setVxnets(List<InstanceVxnet> vxnets) {
        this.vxnets = vxnets;
    }

    public List<InstanceVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<InstanceVolume> volumes) {
        this.volumes = volumes;
    }

    public List<InstanceKeypair> getKeypairIds() {
        return keypairIds;
    }

    public void setKeypairIds(List<InstanceKeypair> keypairIds) {
        this.keypairIds = keypairIds;
    }

    public InstanceSecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(InstanceSecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    public InstanceEip getEip() {
        return eip;
    }

    public void setEip(InstanceEip eip) {
        this.eip = eip;
    }

    public String getGraphicsProtocol() {
        return graphicsProtocol;
    }

    public void setGraphicsProtocol(String graphicsProtocol) {
        this.graphicsProtocol = graphicsProtocol;
    }

    public String getGraphicsPasswd() {
        return graphicsPasswd;
    }

    public void setGraphicsPasswd(String graphicsPasswd) {
        this.graphicsPasswd = graphicsPasswd;
    }

    @Override
    public String toString() {
        return "DescribeInstance{" +
                "instanceId='" + instanceId + '\'' +
                ", instanceName='" + instanceName + '\'' +
                ", description='" + description + '\'' +
                ", instanceType=" + instanceType +
                ", vcpusCurrent=" + vcpusCurrent +
                ", memoryCurrent=" + memoryCurrent +
                ", status='" + status + '\'' +
                ", transitionStatus='" + transitionStatus + '\'' +
                ", createTime='" + createTime + '\'' +
                ", statusTime='" + statusTime + '\'' +
                ", image=" + image +
                ", vxnets=" + vxnets +
                ", volumes=" + volumes +
                ", keypairIds=" + keypairIds +
                ", securityGroup=" + securityGroup +
                ", eip=" + eip +
                ", graphicsProtocol='" + graphicsProtocol + '\'' +
                ", graphicsPasswd='" + graphicsPasswd + '\'' +
                '}';
    }
}

