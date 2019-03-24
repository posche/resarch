package com.hy.demo.com.hy.demo.pattern.factory.delegate;

/**
 * Created by Administrator on 2019/3/24.
 */
public class Boss {

    public void assignTask(String task) {
        new Manager().dispatchWork(task);
    };

}
