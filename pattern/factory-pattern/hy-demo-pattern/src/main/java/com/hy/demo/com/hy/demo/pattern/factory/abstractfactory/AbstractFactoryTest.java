package com.hy.demo.com.hy.demo.pattern.factory.abstractfactory;

/**
 * Created by Administrator on 2019/3/10.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory iFactory = new HuaweiFactory();
        iFactory.createComputer().create();
        iFactory.createMobile().create();

        iFactory = new AppleFactory();
        iFactory.createComputer().create();
        iFactory.createMobile().create();
    }
}
