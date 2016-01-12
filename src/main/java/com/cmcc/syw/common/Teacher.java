package com.cmcc.syw.common;

/**
 * Created by sunyiwei on 15-12-28.
 */
public class Teacher implements Human {
    private String name;
    private float height;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
