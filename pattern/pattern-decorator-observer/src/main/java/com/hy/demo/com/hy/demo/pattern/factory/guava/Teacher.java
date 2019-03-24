package com.hy.demo.com.hy.demo.pattern.factory.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Administrator on 2019/3/25.
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question) {
        System.out.println(this.getName() + "老师收到问题：" + question.getContent());
    }
}
