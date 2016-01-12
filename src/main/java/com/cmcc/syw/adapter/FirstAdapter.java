package com.cmcc.syw.adapter;

/**
 * 适配器的实现, 对象适配器的方式
 *
 * 这种实现方式采用的是组合的方法,相对来讲更灵活
 *
 * 1. 它可以适配所有继承自adaptee的类
 * 2. 如果需要重写adaptee的某些方法,可以通过继承并重写的方式,然后再通过适配器进行适配
 *
 * Created by sunyiwei on 16-1-5.
 */
public class FirstAdapter implements NewInterface {
    private Adaptee source;

    public FirstAdapter(Adaptee source){
        this.source = source;
    }

    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("Hello world, I'm method2. ");
    }

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        NewInterface newInterface = new FirstAdapter(adaptee);
        newInterface.method1();
        newInterface.method2();
    }
}
