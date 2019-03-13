package com.hy.demo.com.hy.demo.pattern.factory.simplefactory;

import com.hy.demo.com.hy.demo.pattern.factory.AppleMobile;
import com.hy.demo.com.hy.demo.pattern.factory.HuaweiMobile;
import com.hy.demo.com.hy.demo.pattern.factory.IMobile;

/**
 * Created by Administrator on 2019/3/9.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();
        IMobile huawei = mobileFactory.create("huawei");
        IMobile apple = mobileFactory.create("apple");
        huawei.create();
        apple.create();

        huawei = mobileFactory.createByClass(HuaweiMobile.class);
        apple = mobileFactory.createByClass(AppleMobile.class);
        huawei.create();
        apple.create();
    }
}
