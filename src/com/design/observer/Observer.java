package com.design.observer;

/**
 * Created by yunfei on 2017-03-23.
 * 观察者接口，定义一个更新的接口给目标发生改变时被通知的对象
 */
public interface Observer {
    void update(Subject subject);
}
