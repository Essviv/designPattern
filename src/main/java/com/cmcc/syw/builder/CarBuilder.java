package com.cmcc.syw.builder;

import com.cmcc.syw.common.Car;

/**
 * 建造者模式的实现代码
 * 1. 注意与模板模式的区别
 * 2. 注意引导类的使用方法
 *
 * Created by sunyiwei on 16-1-5.
 */
public interface CarBuilder {
    void buildEngine();

    void buildWheel();

    void bulidCabin();

    Car getCar();
}
