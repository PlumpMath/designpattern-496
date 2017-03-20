package com.design.proxy.cglibproxy;

/**
 * Created by yunfei on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Train t = (Train) proxy.getProxy(Train.class);
        t.move();
    }
}
