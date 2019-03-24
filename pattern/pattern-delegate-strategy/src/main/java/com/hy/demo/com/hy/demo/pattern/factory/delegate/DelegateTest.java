package com.hy.demo.com.hy.demo.pattern.factory.delegate;

/**
 * Created by Administrator on 2019/3/24.
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.assignTask("售前");
        boss.assignTask("售中");
        boss.assignTask("售后");
    }
}
