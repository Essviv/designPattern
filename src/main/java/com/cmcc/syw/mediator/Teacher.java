package com.cmcc.syw.mediator;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class Teacher implements Person {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void send(String content) {
        System.out.println("Teacher " + name  + ": " + content);
    }

    public void receive(String content) {
        System.out.println("Teacher " + name  + ": " + content);
    }
}
