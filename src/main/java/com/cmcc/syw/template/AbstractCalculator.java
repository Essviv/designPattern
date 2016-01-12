package com.cmcc.syw.template;

/**
 * 模板方法模式的实现代码
 *
 * 注意区别这种设计模式和建造者模式的异同
 * 在JAVA中,有很多基于这种模式的实现
 *
 * Created by sunyiwei on 16-1-7.
 */
public abstract class AbstractCalculator {
    /**
     * 这里这个方法就是模式方法的实现,saySomething的实现被延迟到了子类中
     */
    public void calculate() {
        saySomething();

        calculateInternal();
    }

    protected abstract void saySomething();

    private void calculateInternal() {
        System.out.println("Hello world from abstract calculator.");
    }

    public static void main(String[] args) {
        AbstractCalculator calculator = new AddCalculator();
        calculator.calculate();

        calculator = new MinusCalculator();
        calculator.calculate();
    }
}
