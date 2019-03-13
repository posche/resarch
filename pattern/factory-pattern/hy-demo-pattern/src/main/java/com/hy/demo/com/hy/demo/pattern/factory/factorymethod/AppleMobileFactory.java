package com.hy.demo.com.hy.demo.pattern.factory.factorymethod;

import com.hy.demo.com.hy.demo.pattern.factory.AppleMobile;
import com.hy.demo.com.hy.demo.pattern.factory.IMobile;

/**
 * Created by Administrator on 2019/3/10.
 */
public class AppleMobileFactory implements IMobileFactory {
    @Override
    public IMobile create() {
        return new AppleMobile();
    }
}
