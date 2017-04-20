package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.InstanceLoginMode;
import com.anchnet.cloud.common.InstanceType;

/**
 * Created by liangs on 17/3/13.
 */
public class RunInstance {
    @JSONField(name = "image_id")
    public String imageId;
    @JSONField(name = "instance_type")
    public InstanceType instanceType;
    @JSONField(name = "cpu")
    public Integer cpu;
    @JSONField(name = "memory")
    public Integer memory;
    @JSONField(name = "count")
    public Integer count = 1;
    @JSONField(name = "instance_name")
    public String instanceName;
    @JSONField(name = "login_mode")
    public InstanceLoginMode loginMode = InstanceLoginMode.passwd;
    @JSONField(name = "login_keypair")
    public String loginKeypair;
    @JSONField(name = "login_passwd")
    public String loginPassWd;
    @JSONField(name = "security_group")
    public String securityGroup;
    @JSONField(name = "host_name")
    public String hostName;
    @JSONField(name = "need_newsid")
    public Integer needNewsid;
    @JSONField(name = "need_userdata")
    public Integer needUserData;
    @JSONField(name = "userdata_type")
    public String userDataType;
    @JSONField(name = "userdata_value")
    public String userDataValue;
    @JSONField(name = "cpu_model")
    public String cpuModel;
    @JSONField(name = "cpu_topology")
    public String cpuTopology;
    @JSONField(name = "userdata_path")
    public String userdataPath;
    @JSONField(name = "userdata_file")
    public String userdataFile;


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

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceLoginMode getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(InstanceLoginMode loginMode) {
        this.loginMode = loginMode;
    }

    public String getLoginKeypair() {
        return loginKeypair;
    }

    public void setLoginKeypair(String loginKeypair) {
        this.loginKeypair = loginKeypair;
    }

    public String getLoginPassWd() {
        return loginPassWd;
    }

    public void setLoginPassWd(String loginPassWd) {
        this.loginPassWd = loginPassWd;
    }

    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getNeedNewsid() {
        return needNewsid;
    }

    public void setNeedNewsid(Integer needNewsid) {
        this.needNewsid = needNewsid;
    }

    public Integer getNeedUserData() {
        return needUserData;
    }

    public void setNeedUserData(Integer needUserData) {
        this.needUserData = needUserData;
    }

    public String getUserDataType() {
        return userDataType;
    }

    public void setUserDataType(String userDataType) {
        this.userDataType = userDataType;
    }

    public String getUserDataValue() {
        return userDataValue;
    }

    public void setUserDataValue(String userDataValue) {
        this.userDataValue = userDataValue;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getCpuTopology() {
        return cpuTopology;
    }

    public void setCpuTopology(String cpuTopology) {
        this.cpuTopology = cpuTopology;
    }

    public String getUserdataPath() {
        return userdataPath;
    }

    public void setUserdataPath(String userdataPath) {
        this.userdataPath = userdataPath;
    }

    public String getUserdataFile() {
        return userdataFile;
    }

    public void setUserdataFile(String userdataFile) {
        this.userdataFile = userdataFile;
    }

    @Override
    public String toString() {
        return "RunInstance{" +
                "imageId='" + imageId + '\'' +
                ", instanceType=" + instanceType +
                ", cpu=" + cpu +
                ", memory=" + memory +
                ", count=" + count +
                ", instanceName='" + instanceName + '\'' +
                ", loginMode=" + loginMode +
                ", loginKeypair='" + loginKeypair + '\'' +
                ", loginPassWd='" + loginPassWd + '\'' +
                ", securityGroup='" + securityGroup + '\'' +
                ", hostName='" + hostName + '\'' +
                ", needNewsid=" + needNewsid +
                ", needUserData=" + needUserData +
                ", userDataType='" + userDataType + '\'' +
                ", userDataValue='" + userDataValue + '\'' +
                ", cpuModel='" + cpuModel + '\'' +
                ", cpuTopology='" + cpuTopology + '\'' +
                ", userdataPath='" + userdataPath + '\'' +
                ", userdataFile='" + userdataFile + '\'' +
                '}';
    }
}
