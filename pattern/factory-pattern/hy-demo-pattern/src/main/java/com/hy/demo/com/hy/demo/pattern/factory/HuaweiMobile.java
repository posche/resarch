package com.hy.demo.com.hy.demo.pattern.factory;

/**
 * Created by Administrator on 2019/3/10.
 */
public class HuaweiMobile implements IMobile {
    @Override
    public void create() {
        System.out.println("生产华为手机");
    }
}
