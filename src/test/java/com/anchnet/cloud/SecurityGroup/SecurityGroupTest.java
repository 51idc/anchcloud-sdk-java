package com.anchnet.cloud.SecurityGroup;

import com.anchnet.cloud.BaseTest;
import com.anchnet.cloud.instance.InstanceClient;
import com.anchnet.cloud.security_group.DescribeSecurityGroupRequest;
import com.anchnet.cloud.security_group.SecurityGroupClient;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by liangs on 17/3/13.
 */
public class SecurityGroupTest extends BaseTest {

    private SecurityGroupClient securityGroupClient;

    @Before
    public void securityGroupInit()throws Exception {
        securityGroupClient = new SecurityGroupClient(this.clientId, this.clientSecret);
    }

    @Test
    public void DescribeSecurityGroup()throws Exception {
        DescribeSecurityGroupRequest request = new DescribeSecurityGroupRequest();
        request.setZone(this.zone);
        securityGroupClient.DescribeSecurityGroup(request);
    }

}
