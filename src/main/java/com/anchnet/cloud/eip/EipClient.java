package com.anchnet.cloud.eip;

import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.anchnet.cloud.http.ApiClient;
import com.anchnet.cloud.utils.CommonHelper;
import com.google.common.base.Strings;

/**
 * Created by liangs on 17/3/13.
 */
public class EipClient extends ApiClient implements IEipClient {
    public EipClient(String apiKey, String secretKey)throws AuthCloudHttpException {
        super(apiKey, secretKey);
    }

    public EipClient(String apiKey, String secretKey, int connectTimeOut)throws AuthCloudHttpException  {
        super(apiKey, secretKey, connectTimeOut);
    }

    public EipClient(String apiKey, String secretKey, int connectTimeOut, String endPoint)throws AuthCloudHttpException  {
        super(apiKey, secretKey, connectTimeOut, endPoint);
    }

    @Override
    public DescribeEipGroupResponse DescribeEipGroup(String zone) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone), "DescribeEipGroup zone is require");
        String url = String.format(EipContent.URL_EIP_GROUP_DESCRIBE, zone);
        DescribeEipGroupResponse response = doGetRequest(url, null, DescribeEipGroupResponse.class);
        return response;
    }
}
