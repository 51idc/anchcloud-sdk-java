package com.anchnet.cloud.volume;

/**
 * Created by liangs on 17/3/10.
 */
public interface IVolumeClient {
    DescribeVolumeResponse describeVolume(DescribeVolumeRequest request) throws Exception;
}
