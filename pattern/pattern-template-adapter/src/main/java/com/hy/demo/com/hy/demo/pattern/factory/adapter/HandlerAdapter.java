package com.hy.demo.com.hy.demo.pattern.factory.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/3/24.
 */
public class HandlerAdapter {
    private List<IAdapter> adapters = new ArrayList<>();

    public HandlerAdapter(){
        adapters.add(new OrderHandlerAdapter());
        adapters.add(new PayHandlerAdapter());
        adapters.add(new UserHandlerAdapter());
    }

    public IAdapter getAdapter(IHandler handler) {
        for (IAdapter adapter : adapters) {
            if (adapter.support(handler)) {
                return adapter;
            }
        }
        return null;
    }
}
