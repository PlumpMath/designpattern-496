package com.design.proxy;

/**
 * Created by yunfei on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        //集成方式
//        MoveAble m = new Car2();
//        m.move();
        //聚合方式
//        Car car = new Car();
//        MoveAble m1 = new CarTimeProxy(car);
//        m1.move();

        Car car = new Car();
        CarTimeProxy ctp = new CarTimeProxy(car);
        CarLogProxy clp = new CarLogProxy(ctp);
        clp.move();
    }
}
