package com.design.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yunfei on 2017-03-23.
 */
public class ConcreteWeatherObserver implements Observer{

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    private String observerName;
    @Override
    public void update(Observable o, Object arg) {
        //推模型方式
        System.out.println(observerName + "收到消息推送" + arg);

        System.out.println(observerName + "收到消息拉取" + ((ConcreteWeatherSubject)o).getContent());
    }
}
