package com.hy.demo.com.hy.demo.pattern.factory.singleton;

/**
 * 内部类单例
 * Created by Administrator on 2019/3/23.
 */
public class InterClass {

    private InterClass(){}

    public static final InterClass getInstance() {
        return InterClassHolder.INSTANCE;
    }

    private static class InterClassHolder {
        private static final InterClass INSTANCE = new InterClass();
    }
}
