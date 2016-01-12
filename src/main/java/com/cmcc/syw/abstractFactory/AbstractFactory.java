package com.cmcc.syw.abstractFactory;

import com.cmcc.syw.common.Human;

/**
 * 抽象工厂的实现代码,它的优点是类型的识别延迟到子类的实现中
 * 这样当需要增加新的类型时,只需要实现新的工厂类即可
 *
 * Created by sunyiwei on 15-12-30.
 */
public interface AbstractFactory {
    Human create();
}
