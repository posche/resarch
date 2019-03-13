package com.hy.demo.com.hy.demo.pattern.factory.abstractfactory;

import com.hy.demo.com.hy.demo.pattern.factory.IComputer;
import com.hy.demo.com.hy.demo.pattern.factory.IMobile;

/**
 * Created by Administrator on 2019/3/10.
 */
public interface IFactory {
    IMobile createMobile();
    IComputer createComputer();
}
