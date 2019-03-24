package com.hy.demo.com.hy.demo.pattern.factory.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2019/3/24.
 */
public class GPer extends Observable {
    private String name = "GPer";

    public GPer() {
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUsername() + "提出了问题，内容：" + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
