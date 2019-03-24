package com.hy.demo.com.hy.demo.pattern.factory.observer;

/**
 * Created by Administrator on 2019/3/24.
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = new GPer();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");

        Question question = new Question();
        question.setUsername("小明");
        question.setContent("如何成为一个大牛？");

        gPer.addObserver(tom);
        gPer.addObserver(mic);

        gPer.publishQuestion(question);
    }
}
