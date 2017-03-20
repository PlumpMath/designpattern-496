package com.design.singleton;

/**
 * Created by yunfei on 2017/3/20.
 * 单例模式
 * 懒汉模式
 */
public class Singleton2 {
    //私有化
    private Singleton2(){

    }
    //创建唯一实例
    private static Singleton2 instance;

    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

}
