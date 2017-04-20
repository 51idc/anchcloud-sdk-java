package com.anchnet.cloud.instance;

import com.anchnet.cloud.common.Job;

import java.util.List;

/**
 * Created by liangs on 17/3/8.
 */
public interface IInstanceClient {

    DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception;

    Job runInstance(RunInstanceRequest request) throws Exception;

    Job startInstance(List<String> instanceIds,String zone) throws Exception;

    Job stopInstance(List<String> instanceIds,String zone) throws Exception;

    Job restartInstance(List<String> instanceIds,String zone) throws Exception;

    Job resetInstance(ResetInstanceRequest request) throws Exception;

    Job resetInstancePassWord(List<String> instanceIds, String loginPasswd, String zone) throws Exception;

    Job resizeInstance(ResizeInstanceRequest request) throws Exception;

    Job deletedInstance(String instanceId, String zone) throws Exception;

    void ModifyIntanceAttribute(ModifyInstanceRequest request) throws Exception;

    ConfigResponse getInstanceConfig(String zone) throws Exception;

}
