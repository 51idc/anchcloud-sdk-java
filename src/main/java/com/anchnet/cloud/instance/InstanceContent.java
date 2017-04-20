package com.anchnet.cloud.instance;

/**
 * Created by liangs on 17/3/7.
 */
public class InstanceContent {

    public static final String API_HOST = "https://openapi.51idc.com";
    public static final String URL_INSTANCE_DESCRIBE = API_HOST + "/v2/zone/%s/instances";
    public static final String URL_INSTANCE_CREATE = API_HOST + "/v2/zone/%s/instances";
    public static final String URL_INSTANCE_MODIFY = API_HOST + "/v2/zone/%s/instances";
    public static final String URL_INSTANCE_START = API_HOST + "/v2/zone/%s/instances/start";
    public static final String URL_INSTANCE_STOP = API_HOST + "/v2/zone/%s/instances/stop";
    public static final String URL_INSTANCE_RESTART = API_HOST + "/v2/zone/%s/instances/restart";
    public static final String URL_INSTANCE_RESET = API_HOST + "/v2/zone/%s/instances/reset";
    public static final String URL_INSTANCE_RESIZE = API_HOST + "/v2/zone/%s/instances/resize";
    public static final String URL_INSTANCE_RESET_PASSWORD = API_HOST + "/v2/zone/%s/instances/reset_password";
    public static final String URL_INSTANCE_DELETE = API_HOST + "/v2/zone/%s/instances/%s";
    public static final String URL_INSTANCE_CONFIG = API_HOST + "/v2/zone/%s/config";

}
