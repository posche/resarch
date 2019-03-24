package com.hy.demo.com.hy.demo.pattern.factory.adapter;

/**
 * Created by Administrator on 2019/3/24.
 */
public class OrderHandlerAdapter implements IAdapter{
    @Override
    public boolean support(Object handler) {
        return handler instanceof OrderHandler;
    }

    @Override
    public void handle(Object handler) {
        ((OrderHandler)handler).doOrderHandler();
    }
}
