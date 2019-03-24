package com.hy.demo.com.hy.demo.pattern.factory.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/24.
 */
public class OrderManager {
    private Map<String, IOrder> map = new HashMap<>();

    public OrderManager() {
        map.put("domestic", new DomesticOrder());
        map.put("international", new InternationalOrder());
    }

    public Map<String, IOrder> getMap() {
        return map;
    }

    public void setMap(Map<String, IOrder> map) {
        this.map = map;
    }
}
