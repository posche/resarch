package com.hy.demo.com.hy.demo.pattern.factory.template;

/**
 * Created by Administrator on 2019/3/24.
 */
public class TemplateTest {
    public static void main(String[] args) {
        TaobaoShopping taobaoShopping = new TaobaoShopping();
        taobaoShopping.shop();

        System.out.println("-------------------------");

        JDShopping jdShopping = new JDShopping();
        jdShopping.shop();
    }
}
