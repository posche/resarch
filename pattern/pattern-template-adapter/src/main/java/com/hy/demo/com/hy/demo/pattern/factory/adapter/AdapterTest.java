package com.hy.demo.com.hy.demo.pattern.factory.adapter;

/**
 * Created by Administrator on 2019/3/24.
 */
public class AdapterTest {
    public static void main(String[] args) {
        HandlerAdapter handlerAdapter = new HandlerAdapter();
        OrderHandler orderHandler = new OrderHandler();

        IAdapter adapter = handlerAdapter.getAdapter(orderHandler);
        adapter.handle(orderHandler);

        PayHandler payHandler = new PayHandler();
        IAdapter adapter1 = handlerAdapter.getAdapter(payHandler);
        adapter1.handle(payHandler);


    }
}
