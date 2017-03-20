package com.design.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yunfei on 2017/3/20.
 */
public class TimeHandle implements InvocationHandler {
    private Object target;

    public TimeHandle(Object target) {
        this.target = target;
    }

    @Override
    /**
     * proxy 被代理对象
     * method 被代理对象的方法
     * args 方法的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        method.invoke(target);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束，时间为：" + (endTime - startTime) + "毫秒");
        return null;
    }
}
