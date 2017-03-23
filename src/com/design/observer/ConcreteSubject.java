package com.design.observer;

/**
 * Created by yunfei on 2017-03-23.
 * 具体目标对象
 */
public class ConcreteSubject extends Subject {
    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notityObserver();
    }

    private String subjectState;
}
