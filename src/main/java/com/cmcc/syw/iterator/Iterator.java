package com.cmcc.syw.iterator;

/**
 * 迭代器模式中的iterator接口, 它简化了遍历aggregate中元素的操作,使得外界可以在不了解内部数据结构的情况下遍历所有元素
 *
 * Created by sunyiwei on 2016/12/20.
 */
public interface Iterator<T> {
    //是否有下一个节点
    boolean hasNext();

    //获取下一个节点
    T next();
}
