package com.hy.demo.pattern.prototype;

import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2019/3/17.
 */
public class RedesignCopy {
    public static void main(String[] args) {
        Order order = new Order();
        order.setChannel("wx");
        order.setOrderNo("order_20190301");
        order.setOrderStatus("A");
        order.setUser("小明");
        OrderExtension orderExtension = new OrderExtension();
        orderExtension.setOutOrderNo("out_order_20190301");
        orderExtension.setOutOrderStatus("1");
        order.setOrderExtension(orderExtension);
        System.out.println(order);


        String s = JSON.toJSONString(order);
        Order newOrder = (Order) JSON.parseObject(s, Order.class);
        System.out.println(newOrder);
    }
}
