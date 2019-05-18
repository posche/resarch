package com.hy.service.impl;

import com.hy.framework.annotation.HYService;
import com.hy.service.IService;

/**
 * Created by Administrator on 2019/4/23.
 */
@HYService(value = "iService")
public class ServiceImpl implements IService {
    @Override
    public String hello(String name) {
        return "hi," + name;
    }
}
