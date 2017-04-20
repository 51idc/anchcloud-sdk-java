package com.anchnet.cloud.eip;

/**
 * Created by liangs on 17/3/13.
 */
public interface IEipClient {
    DescribeEipGroupResponse DescribeEipGroup(String zone) throws Exception;
}
