package com.hy.demo.com.hy.demo.pattern.factory.singleton;

/**
 * 饿汉式单例
 * Created by Administrator on 2019/3/23.
 */
public class Hungry {
    private static final Hungry hungry = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance(){
        return hungry;
    }
}
