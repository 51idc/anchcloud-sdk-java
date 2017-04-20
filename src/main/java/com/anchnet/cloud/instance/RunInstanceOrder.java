package com.anchnet.cloud.instance;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by liangs on 17/3/13.
 */
public class RunInstanceOrder {
    @JSONField(name = "payment_type")
    public String paymentType = "POSTPAY";

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "RunInstanceOrder{" +
                "paymentType='" + paymentType + '\'' +
                '}';
    }
}
