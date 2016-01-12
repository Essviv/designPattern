package com.cmcc.syw.common;

/**
 * Created by sunyiwei on 15-12-28.
 */
public class Student implements Human {
    private String name;
    private String addr;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
