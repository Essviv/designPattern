package com.cmcc.syw.abstractFactory;

import com.cmcc.syw.common.Human;
import com.cmcc.syw.common.Student;

/**
 * Created by sunyiwei on 15-12-30.
 */
public class StudentFactory implements AbstractFactory {
    public Human create() {
        return new Student("student");
    }

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new StudentFactory();
        Human human = abstractFactory.create();
        System.out.println(human.getName());
    }
}
