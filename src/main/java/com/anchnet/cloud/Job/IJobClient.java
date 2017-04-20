package com.anchnet.cloud.Job;

import com.anchnet.cloud.common.Job;

/**
 * Created by liangs on 17/3/13.
 */
public interface IJobClient {
    Job DescribeJob(String jobId,String zone) throws Exception;
}
