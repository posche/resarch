package com.hy.demo.com.hy.demo.pattern.factory.simplefactory;

import com.hy.demo.com.hy.demo.pattern.factory.AppleMobile;
import com.hy.demo.com.hy.demo.pattern.factory.HuaweiMobile;
import com.hy.demo.com.hy.demo.pattern.factory.IMobile;
import com.hy.demo.utils.StringUtils;

/**
 * Created by Administrator on 2019/3/10.
 */
public class MobileFactory {
    IMobile create(String name) {
        if (StringUtils.isEmpty(name)){return null;}
        if (name.equals("huawei")) {
            return new HuaweiMobile();
        }else if (name.equals("apple")) {
            return new AppleMobile();
        }
        return null;
    }

    IMobile createByClass(Class<? extends IMobile> clazz) {
        try {
            return null == clazz ? null : clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
