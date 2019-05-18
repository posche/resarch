package com.hy.demo.controller;

import com.hy.framework.annotation.HYAutoWired;
import com.hy.framework.annotation.HYController;
import com.hy.framework.annotation.HYRequestMapping;
import com.hy.framework.annotation.HYRequestParam;
import com.hy.service.IService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/4/22.
 */
@HYController
@HYRequestMapping(value = "/test")
public class TestController {
    @HYAutoWired
    private IService iService;

    @HYRequestMapping(value = "/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response, @HYRequestParam("name") String name) {
        try {
            String result = "hello " + name;
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
