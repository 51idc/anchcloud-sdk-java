package com.anchnet.cloud.common;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by liangs on 17/3/8.
 */
public class Job {
    @JSONField(name = "job_id")
    public String jobId;
    @JSONField(name = "id_prefix")
    public String idPrefix;
    @JSONField(name = "action")
    public String action;
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "status")
    public String status;
    @JSONField(name = "create_time")
    public String createTime;
    @JSONField(name = "begin_time")
    public String beginTime;
    @JSONField(name = "finished_time")
    public String finishedTime;
    @JSONField(name = "extra")
    public String extra;
    @JSONField(name = "zone")
    public String zone;
    @JSONField(name = "resource_ids")
    public List<String> resourceIds;
    @JSONField(name = "error")
    public Error error;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getIdPrefix() {
        return idPrefix;
    }

    public void setIdPrefix(String idPrefix) {
        this.idPrefix = idPrefix;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId='" + jobId + '\'' +
                ", idPrefix='" + idPrefix + '\'' +
                ", action='" + action + '\'' +
                ", requestId='" + requestId + '\'' +
                ", status='" + status + '\'' +
                ", createTime='" + createTime + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", finishedTime='" + finishedTime + '\'' +
                ", extra='" + extra + '\'' +
                ", zone='" + zone + '\'' +
                ", resourceIds=" + resourceIds +
                ", error=" + error +
                '}';
    }
}
