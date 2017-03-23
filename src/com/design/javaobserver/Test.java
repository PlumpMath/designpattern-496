package com.design.javaobserver;

/**
 * Created by yunfei on 2017-03-23.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        ConcreteWeatherObserver observer1 = new ConcreteWeatherObserver();
        observer1.setObserverName("obobobob1");
        ConcreteWeatherObserver observer2 = new ConcreteWeatherObserver();
        observer2.setObserverName("bobobobo2");
        weather.addObserver(observer1);
        weather.addObserver(observer2);
        weather.setContent("这是消息");

    }
}
