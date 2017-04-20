package com.anchnet.cloud.volume;

import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.anchnet.cloud.http.ApiClient;
import com.anchnet.cloud.utils.CommonHelper;
import com.google.common.base.Strings;

/**
 * Created by liangs on 17/3/10.
 */
public class VolumeClient extends ApiClient implements IVolumeClient {

    public VolumeClient(String apiKey, String secretKey)throws AuthCloudHttpException {
        super(apiKey, secretKey);
    }

    public VolumeClient(String apiKey, String secretKey, int connectTimeOut)throws AuthCloudHttpException  {
        super(apiKey, secretKey, connectTimeOut);
    }

    public VolumeClient(String apiKey, String secretKey, int connectTimeOut, String endPoint)throws AuthCloudHttpException  {
        super(apiKey, secretKey, connectTimeOut, endPoint);
    }

    @Override
    public DescribeVolumeResponse describeVolume(DescribeVolumeRequest request) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone), "DescribeVolume zone is require");
        String url = String.format(VolumeContent.URL_VOLUME_DESCRIBE, request.zone);
        DescribeVolumeResponse response = doGetRequest(url, request.toMap(), DescribeVolumeResponse.class);
        return response;
    }
}
