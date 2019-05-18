package com.hy.demo;

/**
 * Created by Administrator on 2019/5/18.
 */
public class Job {
    public boolean startJob(String startDate, String endDate) {
        Thread t = new Thread(()->{
            //do job detail
            //使用线程处理JOB，接口同步返回，减少接口响应时长。
        });
        t.start();
        return true;
    }

}
