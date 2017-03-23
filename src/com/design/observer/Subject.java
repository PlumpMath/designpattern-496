package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunfei on 2017-03-23.
 * 目标对象，提供注册和删除观察者的接口
 */
public class Subject {
    //保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();

    //添加
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    protected void notityObserver(){
        for (Observer observer:observers){
            observer.update(this);
        }
    }
}
