package com.hy.demo.com.hy.demo.pattern.factory.factorymethod;

import com.hy.demo.com.hy.demo.pattern.factory.HuaweiMobile;
import com.hy.demo.com.hy.demo.pattern.factory.IMobile;

/**
 * Created by Administrator on 2019/3/10.
 */
public class HuaweiMobileFactory implements IMobileFactory {
    @Override
    public IMobile create() {
        return new HuaweiMobile();
    }
}
