package com.anchnet.cloud.image;

import com.anchnet.cloud.common.Job;
import com.anchnet.cloud.exceptions.AuthCloudHttpException;
import com.anchnet.cloud.http.ApiClient;
import com.anchnet.cloud.utils.CommonHelper;
import com.google.common.base.Strings;

import java.util.List;

/**
 * Created by liangs on 17/3/10.
 */
public class ImageClient extends ApiClient implements IImageClient {

    public ImageClient(String apiKey, String secretKey) throws AuthCloudHttpException {
        super(apiKey, secretKey);
    }

    public ImageClient(String apiKey, String secretKey, int connectTimeOut) throws AuthCloudHttpException {
        super(apiKey, secretKey, connectTimeOut);
    }

    public ImageClient(String apiKey, String secretKey, int connectTimeOut, String endPoint) throws AuthCloudHttpException {
        super(apiKey, secretKey, connectTimeOut, endPoint);
    }

    @Override
    public Job createImage(CreateImageRequest request) throws Exception{
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone),"CreateImage zone is require");
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.instance),"CreateImage instance is require");
        String url = String.format(ImageContent.URL_IMAGE_CREATE, request.zone);
        Job job = doPostRequest(url, request, Job.class);
        return job;
    }

    @Override
    public DescribeImageResponse describeImage(DescribeImageRequest request) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(request.zone),"DescribeImage zone is require");
        String url = String.format(ImageContent.URL_IMAGE_DESCRIBE, request.zone);
        DescribeImageResponse response = doGetRequest(url, request.toMap(), DescribeImageResponse.class);
        return response;
    }

    @Override
    public Job deleteImage(List<String> imageIds, String zone) throws Exception {
        CommonHelper.validateDate(!Strings.isNullOrEmpty(zone),"DeleteImage zone is require");
        CommonHelper.validateDate(null != imageIds && imageIds.size() > 0, "DeleteImage imageIds is require");
        String url = String.format(ImageContent.URL_IMAGE_DELETE, zone, CommonHelper.formatList(imageIds));
        Job job = doDeletedRequest(url, null, Job.class);
        return job;
    }
}
