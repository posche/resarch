package com.hy.demo.com.hy.demo.pattern.factory.guava;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/24.
 */
public class Question implements Serializable{
    private String username;
    private String content;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
