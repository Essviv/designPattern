package com.cmcc.syw.simpleFactory;

import com.cmcc.syw.common.Human;
import com.cmcc.syw.common.Student;
import com.cmcc.syw.common.Teacher;

/**
 * 简单工厂的实现代码
 *
 * Created by sunyiwei on 15-12-28.
 */
public class SimpleFactory {
    /**
     * 简单工厂的实现,很明显可以看出,这里如果输入的值不小心出错了,就会导致方法返回null
     *
     * @param category
     * @return
     */
    public static Human createHuman(String category){
        if(category.equals("student")){
            return new Student("sunyiwei");
        }else if(category.equals("teacher")){
            return new Teacher("patrick");
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Human student = SimpleFactory.createHuman("student");
        Human teacher = SimpleFactory.createHuman("teacher");

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
