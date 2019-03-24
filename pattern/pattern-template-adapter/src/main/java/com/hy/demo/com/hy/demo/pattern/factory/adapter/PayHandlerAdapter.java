package com.hy.demo.com.hy.demo.pattern.factory.adapter;

/**
 * Created by Administrator on 2019/3/24.
 */
public class PayHandlerAdapter implements IAdapter {
    @Override
    public boolean support(Object handler) {
        return handler instanceof PayHandler;
    }

    @Override
    public void handle(Object handler) {
        ((PayHandler)handler).doPayHandler();
    }
}
