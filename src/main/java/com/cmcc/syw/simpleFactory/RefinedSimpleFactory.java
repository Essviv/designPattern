package com.cmcc.syw.simpleFactory;

import com.cmcc.syw.common.Human;
import com.cmcc.syw.common.Student;
import com.cmcc.syw.common.Teacher;

/**
 * 改进后的简单类工厂,通过创建多个工厂方法,避免外部直接传入类型值
 * 但这种工厂模式的缺点在于,如果增加新的类别,则必须要修改/增加工厂类方法
 *
 * Created by sunyiwei on 15-12-30.
 */
public class RefinedSimpleFactory {
    public static Student createStudent(){
        return new Student("sunyiwei");
    }

    public static Teacher createTeacher(){
        return new Teacher("patrick");
    }

    public static void main(String[] args) {
        Human student = RefinedSimpleFactory.createStudent();
        Human teacher = RefinedSimpleFactory.createTeacher();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
