package com.cmcc.syw.singleton;

import com.cmcc.syw.common.Human;
import com.cmcc.syw.common.Student;

/**
 * 单例模式的实现代码,在学习单例模式时,注意它的各种实现间的区别,尤其是要注意区别某种实现是否真的能实现单例
 *
 * Created by sunyiwei on 16-1-5.
 */
public class SingletonFactory {
    private static Human human;

    static {
        human = new Student("sunyiwei");
    }

    public static Human getInstance(){
        return human;
    }

    private SingletonFactory(){

    }

    public static void main(String[] args) {
        Human first = SingletonFactory.getInstance();
        Human second = SingletonFactory.getInstance();

        System.out.println(first == second);
    }
}
