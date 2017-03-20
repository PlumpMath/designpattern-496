package com.design.proxy;

import java.util.Random;

/**
 * Created by yunfei on 2017/3/20.
 */
public class Car implements MoveAble {
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
