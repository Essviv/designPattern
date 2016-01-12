package com.cmcc.syw.strategy;

/**
 * 策略模式的实现代码
 *
 * 策略模式的核心是对外提供统一的接口,并由调用方自行选择使用的具体策略
 *
 * Created by sunyiwei on 16-1-7.
 */
public interface Strategy {
    void calcute();
}
