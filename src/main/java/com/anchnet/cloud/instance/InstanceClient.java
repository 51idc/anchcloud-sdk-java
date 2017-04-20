package com.anchnet.cloud.instance;

import com.anchnet.cloud.common.Job;
import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.anchnet.cloud.http.ApiClient;
import com.anchnet.cloud.utils.CommonHelper;
import com.google.common.base.Strings;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liangs on 17/3/7.
 */
public class InstanceClient extends ApiClient implements IInstanceClient {


    protected Logger LOGGER = Logger.getLogger(InstanceClient.class);


    public InstanceClient(String apiKey, String secretKey) throws AuthCloudHttpException {
        super(apiKey, secretKey);
    }

    public InstanceClient(String apiKey, String secretKey, int timeout) throws AuthCloudHttpException {
        super(apiKey, secretKey, timeout);
    }

    public InstanceClient(String apiKey, String secretKey, int timeout,String endPoint) throws AuthCloudHttpException {
        super(apiKey, secretKey, timeout ,endPoint);
    }

    @Override
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone), "DescribeInstanceRequest zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_DESCRIBE, request.zone);
        Map<String, String> params = request.toMap();
        DescribeInstanceResponse response = doGetRequest(url, params, DescribeInstanceResponse.class);
        return response;
    }

    @Override
    public Job runInstance(RunInstanceRequest request) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone), "RunInstance zone is require");
        CommonHelper.validateDate(null != request.instance, "RunInstance instance is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.instance.imageId), "RunInstance instance imageId is require");
        if (null != request.volumes) {
            for (RunInstanceVolume volume : request.volumes) {
                CommonHelper.validateDate(null != volume.size && volume.size > 0, "RunInstance volume size is require");
            }
        }
        if (null != request.vxnet) {
            CommonHelper.validateDate(null != request.vxnet.vxnetType, "RunInstance Vxnet vxnetType is require");
        }
        if (null != request.eip) {
            CommonHelper.validateDate(null != request.eip.bandwidth && request.eip.bandwidth > 0, "RunInstance Eip BandWidth is require");
            CommonHelper.validateDate(!Strings.isNullOrEmpty(request.eip.eipGroup), "RunInstance Eip EipGroup is require");
        }
        String url = String.format(InstanceContent.URL_INSTANCE_CREATE, request.zone);
        Job job = doPostRequest(url, request, Job.class);
        return job;
    }

    @Override
    public Job startInstance(List<String> instanceIds, String zone) throws Exception {
        CommonHelper.validateDate(null != instanceIds && instanceIds.size() > 0, "StartInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "StartInstance zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_START, zone);
        Map params = new HashMap();
        params.put("instances", instanceIds);
        Job job = doPostRequest(url, params, Job.class);
        return job;
    }

    @Override
    public Job stopInstance(List<String> instanceIds, String zone) throws Exception {
        CommonHelper.validateDate(null != instanceIds && instanceIds.size() > 0, "StopInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "StopInstance zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_STOP, zone);
        Map params = new HashMap();
        params.put("instances", instanceIds);
        Job job = doPostRequest(url, params, Job.class);
        return job;
    }

    @Override
    public Job restartInstance(List<String> instanceIds, String zone) throws Exception {
        CommonHelper.validateDate(null != instanceIds && instanceIds.size() > 0, "RestartInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "RestartInstance zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_RESTART, zone);
        Map params = new HashMap();
        params.put("instances", instanceIds);
        Job job = doPostRequest(url, params, Job.class);
        return job;
    }

    @Override
    public Job resetInstance(ResetInstanceRequest request) throws Exception {
        CommonHelper.validateDate(null != request.instances && request.instances.size() > 0, "ResetInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone), "ResetInstance zone is require");
        CommonHelper.validateDate(null != request.loginMode,"ResetInstance loginMode is require");
        String url = String.format(InstanceContent.URL_INSTANCE_RESET, request.zone);
        Job job = doPostRequest(url, request, Job.class);
        return job;
    }

    @Override
    public Job resetInstancePassWord(List<String> instanceIds, String loginPasswd, String zone) throws Exception {
        CommonHelper.validateDate(null != instanceIds && instanceIds.size() > 0, "RestartPasswordInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "RestartPasswordInstance zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_RESET_PASSWORD, zone);
        Map params = new HashMap();
        params.put("instances", instanceIds);
        Job job = doPostRequest(url, params, Job.class);
        return job;
    }

    @Override
    public Job resizeInstance(ResizeInstanceRequest request) throws Exception {
        CommonHelper.validateDate(null != request.instances && request.instances.size() > 0, "ResizeInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone), "ResizeInstance zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_RESIZE, request.zone);
        Job job = doPostRequest(url, request, Job.class);
        return job;
    }

    @Override
    public Job deletedInstance(String instanceId, String zone) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(instanceId), "DeletedInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "DeletedInstance zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_DELETE, zone,instanceId);
        Map<String,String> params = new HashMap();
        params.put("instances", instanceId);
        Job job = doDeletedRequest(url, null, Job.class);
        return job;
    }

    @Override
    public void ModifyIntanceAttribute(ModifyInstanceRequest request) throws Exception {
        CommonHelper.validateDate(null != request.instances && request.instances.size() > 0, "ModifyInstance instanceIds is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone), "ModifyInstance zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_MODIFY, request.zone);
        doPutRequest(url, request, Object.class);
    }

    @Override
    public ConfigResponse getInstanceConfig(String zone) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "GetInstanceConfig zone is require");
        String url = String.format(InstanceContent.URL_INSTANCE_CONFIG, zone);
        ConfigResponse response = doGetRequest(url, null, ConfigResponse.class);
        return response;
    }
}
