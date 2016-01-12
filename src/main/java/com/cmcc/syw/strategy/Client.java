package com.cmcc.syw.strategy;

/**
 * 策略模式的使用方
 * Created by sunyiwei on 16-1-7.
 */
public class Client {
    public static void main(String[] args) {
        //这里调用方可以自行选择使用的具体策略, 当需要增加其它具体的策略时,不需要修改原来的实现
        Strategy strategy = new FirstConcreteStrategy();
        strategy.calcute();

        strategy = new SecondConcreteStrategy();
        strategy.calcute();
    }
}
