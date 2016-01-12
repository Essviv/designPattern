package com.cmcc.syw.strategy;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class FirstConcreteStrategy implements Strategy {
    public void calcute() {
        System.out.println("Hello world from first strategy.");
    }
}
