package com.hy.demo.com.hy.demo.pattern.factory.adapter;

/**
 * Created by Administrator on 2019/3/24.
 */
public class UserHandlerAdapter implements IAdapter {
    @Override
    public boolean support(Object handler) {
        return handler instanceof UserHandler;
    }

    @Override
    public void handle(Object handler) {
        ((UserHandler)handler).doUserHandler();
    }
}
