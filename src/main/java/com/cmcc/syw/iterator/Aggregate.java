package com.cmcc.syw.iterator;

/**
 * 迭代器模式中的集合接口,它提供了获取迭代器接口的方法
 *
 * Created by sunyiwei on 2016/12/20.
 */
public interface Aggregate<T> {
    //获取迭代器接口
    Iterator<T> iterator();

    //大小
    int size();
}
