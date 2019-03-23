package com.hy.demo.com.hy.demo.pattern.factory.singleton;

import java.util.Objects;

/**
 * 懒汉式单例
 * Created by Administrator on 2019/3/23.
 */
public class Lazy {
    private volatile static Lazy lazy = null;

    private Lazy(){
    }

    public static Lazy getInstance() {
        if (null == lazy) {
            synchronized (Lazy.class){
                if (null == lazy) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
