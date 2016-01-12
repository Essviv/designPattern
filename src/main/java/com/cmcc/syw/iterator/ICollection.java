package com.cmcc.syw.iterator;

/**
 * 迭代子模式的实现代码
 * 迭代子模式被广泛应用于容器中,可以参见具体的实现
 *
 * Created by sunyiwei on 16-1-7.
 */
public interface ICollection<T> {
    IIterator iterator();

    T get(int i);

    int size();

    void add(T obj);
}
