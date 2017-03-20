package com.design.singleton;

/**
 * Created by yunfei on 2017/3/20.
 * 单例模式
 * 饿汉模式,加载类时已经创建类的实例，加载类时较慢，运行时获取对象较快，
 * 线程安全的？？？？？
 */
public class Singleton {
    //私有化
    private Singleton(){

    }
    //创建唯一实例,静态实例
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
