package com.cmcc.syw.observer;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class ObserverImpl implements IObserver {
    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hello world from observer " + name);
    }
}
