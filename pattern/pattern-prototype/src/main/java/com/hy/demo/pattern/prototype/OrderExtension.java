package com.hy.demo.pattern.prototype;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/17.
 */
public class OrderExtension implements Serializable{
    /**外部订单号*/
    private String outOrderNo;
    /**外部订单状态*/
    private String outOrderStatus;

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getOutOrderStatus() {
        return outOrderStatus;
    }

    public void setOutOrderStatus(String outOrderStatus) {
        this.outOrderStatus = outOrderStatus;
    }

    @Override
    public String toString() {
        return "OrderExtension{" +
                "outOrderNo='" + outOrderNo + '\'' +
                ", outOrderStatus='" + outOrderStatus + '\'' +
                '}';
    }
}
