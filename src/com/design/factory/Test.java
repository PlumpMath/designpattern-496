package com.design.factory;

/**
 * Created by yunfei on 2017/3/20.
 */
public class Test {

    public static void main(String[] args) {
//        HairInterface left = new LeftHair();
//        left.draw();
        HairFactory factory = new HairFactory();
        HairInterface left = factory.getHair("left");
        left.draw();

        HairInterface left1 = factory.getHairByClass("com.design.factory.LeftHair");
        left1.draw();

        HairInterface right = factory.getHairByClassKey("right");
        right.draw();
    }

}
