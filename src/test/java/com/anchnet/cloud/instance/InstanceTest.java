package com.anchnet.cloud.instance;

import com.anchnet.cloud.BaseTest;
import com.anchnet.cloud.common.Job;
import com.anchnet.cloud.eip.EipClient;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liangs on 17/3/8.
 */
public class InstanceTest extends BaseTest{
    private IInstanceClient instanceClient;

    @Before
    public void instanceClientInit() throws Exception {
        instanceClient = new InstanceClient(super.clientId, super.clientSecret);
    }


    @Test
    public void describeInstance() throws Exception {
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.setZone(this.zone);
        request.setLimit(20);
        instanceClient.describeInstance(request);
    }

    @Test
    public void runInstance() throws Exception {
        RunInstanceRequest runInstanceRequest = new RunInstanceRequest();
        RunInstanceEip eip = new RunInstanceEip();
        eip.setBandwidth(1);
        eip.setEipGroup("eipg-ea9wdlcd");
        RunInstance instance = new RunInstance();
        instance.setImageId("centos63x64a");
        instance.setCpu(1);
        instance.setCount(3);
        instance.setMemory(1024);
        instance.setInstanceName("liangs_test");
        instance.setLoginPassWd("Aa12345670");
        runInstanceRequest.setZone(this.zone);
        runInstanceRequest.setEip(eip);
        runInstanceRequest.setInstance(instance);
        Job job = instanceClient.runInstance(runInstanceRequest);
        System.out.println(job.toString());
    }

    @Test
    public void stopInstance() throws Exception {
        List<String> instanceIds = new ArrayList<String>();
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.setZone(this.zone);
        request.setLimit(20);
        DescribeInstanceResponse describeInstanceResponse = instanceClient.describeInstance(request);
        for (DescribeInstance tmp : describeInstanceResponse.getInstances()) {
            instanceIds.add(tmp.getInstanceId());
        }
        Job job = instanceClient.stopInstance(instanceIds, zone);
        System.out.println(job.toString());
    }

    @Test
    public void startInstance() throws Exception {
        List<String> instanceIds = new ArrayList<String>();
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.setZone(this.zone);
        request.setLimit(20);
        DescribeInstanceResponse describeInstanceResponse = instanceClient.describeInstance(request);
        for (DescribeInstance tmp : describeInstanceResponse.getInstances()) {
            instanceIds.add(tmp.getInstanceId());
        }
        Job job = instanceClient.startInstance(instanceIds, zone);
        System.out.println(job.toString());
    }

    @Test
    public void restartInstance() throws Exception {
        List<String> instanceIds = new ArrayList<String>();
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.setZone(this.zone);
        request.setLimit(20);
        DescribeInstanceResponse describeInstanceResponse = instanceClient.describeInstance(request);
        for (DescribeInstance tmp : describeInstanceResponse.getInstances()) {
            instanceIds.add(tmp.getInstanceId());
        }
        Job job = instanceClient.restartInstance(instanceIds, zone);
        System.out.println(job.toString());
    }

    @Test
    public void resizeInstance() throws Exception {
        List<String> instanceIds = new ArrayList<String>();
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.setZone(this.zone);
        request.setLimit(20);
        DescribeInstanceResponse describeInstanceResponse = instanceClient.describeInstance(request);
        for (DescribeInstance tmp : describeInstanceResponse.getInstances()) {
            instanceIds.add(tmp.getInstanceId());
        }
        for (String tmp : instanceIds) {
            ResizeInstanceRequest resizeInstanceRequest = new ResizeInstanceRequest();
            resizeInstanceRequest.setInstances(Arrays.asList(tmp));
            resizeInstanceRequest.setZone(zone);
            resizeInstanceRequest.setCpu(20);
            Job job = instanceClient.resizeInstance(resizeInstanceRequest);
            System.out.println(job.toString());
        }
    }

    @Test
    public void deleteInstances() throws Exception {
        List<String> instanceIds = new ArrayList<String>();
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.setZone(this.zone);
        request.setLimit(20);
        DescribeInstanceResponse describeInstanceResponse = instanceClient.describeInstance(request);
        for (DescribeInstance tmp : describeInstanceResponse.getInstances()) {
            instanceIds.add(tmp.getInstanceId());
        }
        for (String tmp : instanceIds) {
            instanceClient.deletedInstance(tmp, zone);
        }
    }

    @Test
    public void modifyInstances() throws Exception {
        List<String> instanceIds = new ArrayList<String>();
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.setZone(this.zone);
        request.setLimit(20);
        DescribeInstanceResponse describeInstanceResponse = instanceClient.describeInstance(request);
        for (DescribeInstance tmp : describeInstanceResponse.getInstances()) {
            instanceIds.add(tmp.getInstanceId());
        }
        ModifyInstanceRequest modifyInstanceRequest = new ModifyInstanceRequest();
        modifyInstanceRequest.setInstances(instanceIds);
        modifyInstanceRequest.setInstanceName("modify_test");
        modifyInstanceRequest.setZone(this.zone);
        instanceClient.ModifyIntanceAttribute(modifyInstanceRequest);
    }


}
