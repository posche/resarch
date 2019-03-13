package com.hy.demo.com.hy.demo.pattern.factory.factorymethod;

import com.hy.demo.com.hy.demo.pattern.factory.IMobile;

/**
 * Created by Administrator on 2019/3/10.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IMobileFactory iMobileFactory = new HuaweiMobileFactory();
        IMobile iMobile = iMobileFactory.create();
        iMobile.create();

        iMobileFactory = new AppleMobileFactory();
        iMobile = iMobileFactory.create();
        iMobile.create();
    }
}
