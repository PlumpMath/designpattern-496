package com.design.proxy;

/**
 * Created by yunfei on 2017/3/20.
 */
public class CarTimeProxy implements MoveAble {
    private MoveAble moveAble;

    public CarTimeProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        moveAble.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束，时间为：" + (endTime - startTime) + "毫秒");
    }
}
