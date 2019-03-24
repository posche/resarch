package com.hy.demo.com.hy.demo.pattern.factory.strategy;

/**
 * Created by Administrator on 2019/3/24.
 */
public class InternationalOrder implements IOrder{
    @Override
    public void doOrder() {
        System.out.println("下国际订单");
    }

    @Override
    public void doRefund() {
        System.out.println("取消国际订单");
    }
}