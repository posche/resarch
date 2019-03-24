package com.hy.demo.com.hy.demo.pattern.factory.strategy;

/**
 * Created by Administrator on 2019/3/24.
 */
public class StrategyTest {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        IOrder domestic = orderManager.getMap().get("domestic");
        domestic.doOrder();
        domestic.doRefund();

        IOrder international = orderManager.getMap().get("international");
        international.doOrder();
        international.doRefund();
    }
}
