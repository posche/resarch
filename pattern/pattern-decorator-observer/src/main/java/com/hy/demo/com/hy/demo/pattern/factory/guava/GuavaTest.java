package com.hy.demo.com.hy.demo.pattern.factory.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Administrator on 2019/3/25.
 */
public class GuavaTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");
        eventBus.register(tom);
        eventBus.register(mic);
        Question question = new Question();
        question.setContent("如何成为大牛？");
        question.setUsername("小明");
        eventBus.post(question);
    }
}
