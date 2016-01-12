package com.cmcc.syw.adapter;

/**
 * 通过继承实现的适配器模式, AKA: 类的适配器
 * 1. 这种方法通过继承的方式实现, 因此它只能适配adaptee, 而不能适配它的子类
 * 2. 这种实现方式可以很方便地重写adaptee的方法
 * 3. 相对来讲, 更推荐通过组合的方式来实现适配器模式
 *
 * Created by sunyiwei on 16-1-5.
 */
public class SecondAdapter extends Adaptee implements NewInterface {
    public void method2() {
        System.out.println("Hello world, I'm method2. ");
    }
}
