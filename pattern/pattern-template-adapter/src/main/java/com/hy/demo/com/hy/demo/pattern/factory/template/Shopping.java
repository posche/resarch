package com.hy.demo.com.hy.demo.pattern.factory.template;

/**
 * Created by Administrator on 2019/3/24.
 */
public abstract class Shopping {
    public final void shop() {
        //下单
        order();

        //支付
        pay();

        //收货
        reveive();

        //评价
        remark();
    }

    protected abstract void order();

    protected abstract void pay();

    protected void reveive(){
        System.out.println("收货了");
    }

    private void remark() {
        System.out.println("宝贝很好，给五星");
    }
}
