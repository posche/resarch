package com.hy.demo.com.hy.demo.pattern.factory.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2019/3/24.
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Question question = (Question) arg;
        System.out.println(this.name +"，您好，您收到一条来自" + question.getUsername() + "问题，内容："  + question.getContent());
    }
}
