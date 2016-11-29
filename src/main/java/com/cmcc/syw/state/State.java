package com.cmcc.syw.state;

/**
 * 状态模式的实现代码
 *
 * 感觉这个模式和策略模式比较像, 考虑比较下它与策略模式的区别
 * 1. 状态模式中的状态切换一般是由上下文类内部实现的,而对外部是不可见的; 而策略模式中的策略一般是由调用方自行选择
 * 2. 两种模式都遵循了"开闭原则"
 *
 * Created by sunyiwei on 16-1-8.
 */
public interface State {
    //不同的状态会有不同的实现
    void sayHello(int count);
}
