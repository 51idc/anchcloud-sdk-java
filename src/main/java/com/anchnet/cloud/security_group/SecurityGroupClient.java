package com.anchnet.cloud.security_group;

import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.anchnet.cloud.http.ApiClient;
import com.anchnet.cloud.utils.CommonHelper;
import com.google.common.base.Strings;

/**
 * Created by liangs on 17/3/13.
 */
public class SecurityGroupClient extends ApiClient implements ISecurityGroupClient {


    public SecurityGroupClient(String apiKey, String secretKey) throws AuthCloudHttpException {
        super(apiKey, secretKey);
    }

    public SecurityGroupClient(String apiKey, String secretKey, int connectTimeOut) throws AuthCloudHttpException {
        super(apiKey, secretKey, connectTimeOut);
    }

    public SecurityGroupClient(String apiKey, String secretKey, int connectTimeOut, String endPoint) throws AuthCloudHttpException {
        super(apiKey, secretKey, connectTimeOut, endPoint);
    }

    @Override
    public DescribeSecurityGroupResponse DescribeSecurityGroup(DescribeSecurityGroupRequest request) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone), "DescribeSecurityGroup zone is require");
        String url = String.format(SecurityGroupContent.URL_INSTANCE_DESCRIBE, request.zone);
        DescribeSecurityGroupResponse response = doGetRequest(url, request.toMap(), DescribeSecurityGroupResponse.class);
        return response;
    }

}
