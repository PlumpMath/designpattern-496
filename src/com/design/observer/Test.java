package com.design.observer;

/**
 * Created by yunfei on 2017-03-23.
 */
public class Test {
    public static void main(String[] args) {
        //创建目标
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        observer1.setObserverName("observer1");
        observer1.setRemindThing("observer1Message");
        ConcreteObserver observer2 = new ConcreteObserver();
        observer2.setObserverName("observer2");
        observer2.setRemindThing("observer2Message");
        //注册观察者
        subject.attach(observer1);
        subject.attach(observer2);
        //实现notity
        subject.setSubjectState("这里是需要提醒的内容");
    }
}
