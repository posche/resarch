package com.hy.demo.com.hy.demo.pattern.factory.abstractfactory;

import com.hy.demo.com.hy.demo.pattern.factory.HuaweiComputer;
import com.hy.demo.com.hy.demo.pattern.factory.HuaweiMobile;
import com.hy.demo.com.hy.demo.pattern.factory.IComputer;
import com.hy.demo.com.hy.demo.pattern.factory.IMobile;

/**
 * Created by Administrator on 2019/3/10.
 */
public class HuaweiFactory implements IFactory {
    @Override
    public IMobile createMobile() {
        return new HuaweiMobile();
    }

    @Override
    public IComputer createComputer() {
        return new HuaweiComputer();
    }
}
