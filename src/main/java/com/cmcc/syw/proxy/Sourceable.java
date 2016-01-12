package com.cmcc.syw.proxy;

/**
 * 代理模式,该模式也是一种动态模式,可以用于动态地给现有实现增加功能
 *
 * 可以考虑比较下这个设计模式和装饰器模式的区别
 *
 * Created by sunyiwei on 16-1-6.
 */
public interface Sourceable {
    void saySomething();
}
