package com.anchnet.cloud.utils;

import com.anchnet.cloud.exceptions.AnchCloudErrorException;

import java.util.List;

/**
 * Created by liangs on 17/3/8.
 */
public class CommonHelper {

    public static String formatList(List<String> strList) {
        if (null == strList || strList.size() < 1) {
            return "";
        }
        StringBuffer str = new StringBuffer();
        for (String tmp : strList) {
            str.append(tmp).append(",");
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }

    public static void validateDate(boolean status, String message) throws Exception {
        if (!status) {
            throw new AnchCloudErrorException("params validate error: " + message);
        }
    }
}
