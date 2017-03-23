package com.design.javaobserver;

import java.util.Observable;

/**
 * Created by yunfei on 2017-03-23.
 */
public class ConcreteWeatherSubject extends Observable {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();

        //推模型实现
        this.notifyObservers(content);
        //拉模型实现
        //this.notifyObservers();
    }

    //内容
    private String content;
}
