package com.anchnet.cloud.image;

import com.anchnet.cloud.common.Job;

import java.util.List;

/**
 * Created by liangs on 17/3/10.
 */
public interface IImageClient {
    Job createImage(CreateImageRequest request) throws Exception;

    DescribeImageResponse describeImage(DescribeImageRequest request) throws Exception;

    Job deleteImage(List<String> imageIds, String zone) throws Exception;
}
