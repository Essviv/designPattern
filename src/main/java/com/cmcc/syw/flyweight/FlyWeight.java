package com.cmcc.syw.flyweight;

/**
 * 享元模式的实现代码
 *
 * 这个设计模式实现的核心思想是,通过工厂的方法,避免重复创建对象,通过池的方式,实现对象的重用
 * 具体可以参考线程池的实现方式
 *
 * Created by sunyiwei on 16-1-6.
 */
public interface FlyWeight {
    String getName();
}
