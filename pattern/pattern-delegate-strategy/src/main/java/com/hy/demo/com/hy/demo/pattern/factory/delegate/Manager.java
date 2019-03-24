package com.hy.demo.com.hy.demo.pattern.factory.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/24.
 */
public class Manager {
    private Map<String, IEmployee> map = new HashMap<>();

    public Manager() {
        map.put("售前", new EmployeeA());
        map.put("售中", new EmployeeB());
        map.put("售后", new EmployeeC());
    }

    public void dispatchWork(String workContent) {
        map.get(workContent).work();
    }
}
