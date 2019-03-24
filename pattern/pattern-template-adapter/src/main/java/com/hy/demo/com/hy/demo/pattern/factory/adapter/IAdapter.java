package com.hy.demo.com.hy.demo.pattern.factory.adapter;

/**
 * Created by Administrator on 2019/3/24.
 */
public interface IAdapter {
    boolean support(Object handler);
    void handle(Object handler);
}
