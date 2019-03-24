package com.hy.demo.com.hy.demo.pattern.factory.delegate;

/**
 * Created by Administrator on 2019/3/24.
 */
public class EmployeeA implements IEmployee {
    @Override
    public void work() {
        System.out.println("我是员工A,我做售前工作");
    }
}
