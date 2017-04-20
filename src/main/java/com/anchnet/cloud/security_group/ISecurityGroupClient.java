package com.anchnet.cloud.security_group;

import com.anchnet.cloud.volume.DescribeVolumeRequest;

/**
 * Created by liangs on 17/3/13.
 */
public interface ISecurityGroupClient {
    DescribeSecurityGroupResponse DescribeSecurityGroup(DescribeSecurityGroupRequest request) throws Exception;
}
