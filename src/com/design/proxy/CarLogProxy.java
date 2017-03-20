package com.design.proxy;

/**
 * Created by yunfei on 2017/3/20.
 */
public class CarLogProxy implements MoveAble {
    private MoveAble moveAble;

    public CarLogProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    @Override
    public void move() {
        System.out.println("日志开始");
        moveAble.move();
        System.out.println("日志结束");
    }
}
