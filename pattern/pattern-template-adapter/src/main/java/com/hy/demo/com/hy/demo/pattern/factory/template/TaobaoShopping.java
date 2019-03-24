package com.hy.demo.com.hy.demo.pattern.factory.template;

/**
 * Created by Administrator on 2019/3/24.
 */
public class TaobaoShopping extends Shopping {
    @Override
    protected void order() {
        System.out.println("我在淘宝下单选了一个宝贝");
    }

    @Override
    protected void pay() {
        System.out.println("我用支付宝进行支付");
    }
}
