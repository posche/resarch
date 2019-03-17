package com.hy.demo.pattern.prototype;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2019/3/17.
 */
public class Order implements Serializable{
    /**订单号*/
    private String orderNo;
    /**渠道*/
    private String channel;
    /**用户*/
    private String user;
    /**订单状态*/
    private String orderStatus;
    /**订单扩展*/
    private OrderExtension orderExtension;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderExtension getOrderExtension() {
        return orderExtension;
    }

    public void setOrderExtension(OrderExtension orderExtension) {
        this.orderExtension = orderExtension;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", channel='" + channel + '\'' +
                ", user='" + user + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderExtension=" + orderExtension +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Order o = (Order) objectInputStream.readObject();
            return o;
        } catch (Exception e) {
           e.printStackTrace();
        }

        return null;
    }
}
