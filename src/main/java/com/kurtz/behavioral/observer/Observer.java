package com.kurtz.behavioral.observer;

//observer
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
