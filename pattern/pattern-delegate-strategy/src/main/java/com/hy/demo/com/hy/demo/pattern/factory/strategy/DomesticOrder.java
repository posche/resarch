package com.hy.demo.com.hy.demo.pattern.factory.strategy;

/**
 * Created by Administrator on 2019/3/24.
 */
public class DomesticOrder implements IOrder{
    @Override
    public void doOrder() {
        System.out.println("国内下单");
    }

    @Override
    public void doRefund() {
        System.out.println("取消国内订单");
    }
}
