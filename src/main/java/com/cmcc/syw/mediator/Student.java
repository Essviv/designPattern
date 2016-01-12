package com.cmcc.syw.mediator;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void send(String content) {
        System.out.println("Student " + name + ": " + content);
    }

    public void receive(String content) {
        System.out.println("Student " + name + ": " + content);
    }
}
