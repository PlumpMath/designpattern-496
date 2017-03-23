package com.design.observer;

/**
 * Created by yunfei on 2017-03-23.
 * 具体的观察者方法，实现更新的方法，使自身的状态与目标一致
 */
public class ConcreteObserver implements Observer {

    //观察者的name
    private String observerName;
    //消息
    private String observerState;
    //提醒的内容
    private String remindThing;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
        System.out.println(observerName + "收到了" + observerState + "," + remindThing);
    }
}
