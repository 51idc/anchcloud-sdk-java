package com.anchnet.cloud.Job;

import com.anchnet.cloud.common.Job;
import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.anchnet.cloud.http.ApiClient;
import com.anchnet.cloud.utils.CommonHelper;
import com.google.common.base.Strings;

/**
 * Created by liangs on 17/3/13.
 */
public class JobClient extends ApiClient implements IJobClient{

    public JobClient(String apiKey, String secretKey) throws AuthCloudHttpException {
        super(apiKey, secretKey);
    }

    public JobClient(String apiKey, String secretKey, int connectTimeOut) throws AuthCloudHttpException {
        super(apiKey, secretKey, connectTimeOut);
    }

    public JobClient(String apiKey, String secretKey, int connectTimeOut, String endPoint) throws AuthCloudHttpException {
        super(apiKey, secretKey, connectTimeOut, endPoint);
    }

    @Override
    public Job DescribeJob(String jobId,String zone) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(jobId), "DescribeJob jobId is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "DescribeJob zone is require");
        String url = String.format(JobContent.URL_INSTANCE_DESCRIBE, zone, jobId);
        Job job = doGetRequest(url, null, Job.class);
        return job;
    }
}
