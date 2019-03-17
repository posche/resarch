package com.hy.demo.pattern.prototype;

/**
 * Created by Administrator on 2019/3/17.
 */
public class DeepClone {
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

        try {
            Order newOrder = (Order) order.clone();
            System.out.println(newOrder);

            System.out.println(order.getOrderExtension() == newOrder.getOrderExtension());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
