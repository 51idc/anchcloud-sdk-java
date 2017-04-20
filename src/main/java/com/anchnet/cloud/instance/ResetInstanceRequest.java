package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;
import com.anchnet.cloud.common.InstanceLoginMode;

import java.util.List;

/**
 * Created by liangs on 17/3/9.
 */
public class ResetInstanceRequest {
    @JSONField(name = "instances")
    public List<String> instances;
    @JSONField(name = "login_mode")
    public InstanceLoginMode loginMode;
    @JSONField(name = "login_keypair")
    public String loginKeypair;
    @JSONField(name = "login_passwd")
    public String loginPasswd;
    @JSONField(name = "need_newsid")
    public Integer needNewsid;
    @JSONField(serialize = false)
    public String zone;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
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

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public Integer getNeedNewsid() {
        return needNewsid;
    }

    public void setNeedNewsid(Integer needNewsid) {
        this.needNewsid = needNewsid;
    }

    @Override
    public String toString() {
        return "ResetInstanceRequest{" +
                "instances=" + instances +
                ", loginMode=" + loginMode +
                ", loginKeypair='" + loginKeypair + '\'' +
                ", loginPasswd='" + loginPasswd + '\'' +
                ", needNewsid=" + needNewsid +
                ", zone='" + zone + '\'' +
                '}';
    }
}
