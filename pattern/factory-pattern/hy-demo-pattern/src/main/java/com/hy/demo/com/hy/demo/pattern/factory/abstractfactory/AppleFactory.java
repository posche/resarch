package com.hy.demo.com.hy.demo.pattern.factory.abstractfactory;

import com.hy.demo.com.hy.demo.pattern.factory.AppleComputer;
import com.hy.demo.com.hy.demo.pattern.factory.AppleMobile;
import com.hy.demo.com.hy.demo.pattern.factory.IComputer;
import com.hy.demo.com.hy.demo.pattern.factory.IMobile;

/**
 * Created by Administrator on 2019/3/10.
 */
public class AppleFactory implements IFactory {
    @Override
    public IMobile createMobile() {
        return new AppleMobile();
    }

    @Override
    public IComputer createComputer() {
        return new AppleComputer();
    }
}
