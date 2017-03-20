package com.design.proxy.jdkproxy;

import com.design.proxy.Car;
import com.design.proxy.MoveAble;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by yunfei on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new TimeHandle(car);
        Class cls = car.getClass();
        /**
         * loader 类加载器
         * interfaces 实现接口
         * h InvocationHandler
         */
        MoveAble m = (MoveAble) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);
        m.move();
    }
}
