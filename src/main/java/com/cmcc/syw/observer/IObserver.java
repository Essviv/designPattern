package com.cmcc.syw.observer;

/**
 * 观察者模式的实现代码
 *
 * 具体可以参考订阅者的实现,当被观察者的状态发生变化时,会通知监听它的观察者
 *
 * Created by sunyiwei on 16-1-7.
 */
public interface IObserver {
    void update();
}
