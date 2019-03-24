package com.hy.demo.com.hy.demo.pattern.factory.template;

/**
 * Created by Administrator on 2019/3/24.
 */
public class JDShopping extends Shopping {
    @Override
    protected void order() {
        System.out.println("我在JD订了一个宝贝");
    }

    @Override
    protected void pay() {
        System.out.println("我用JD白条支付");
    }
}
