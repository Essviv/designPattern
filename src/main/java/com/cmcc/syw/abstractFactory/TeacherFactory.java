package com.cmcc.syw.abstractFactory;

import com.cmcc.syw.common.Human;
import com.cmcc.syw.common.Teacher;

/**
 * Created by sunyiwei on 15-12-30.
 */
public class TeacherFactory implements AbstractFactory {
    public Human create() {
        return new Teacher("teacher");
    }

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new TeacherFactory();
        Human human = abstractFactory.create();
        System.out.println(human.getName());
    }
}
