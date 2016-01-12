package com.cmcc.syw.iterator;

/**
 * Created by sunyiwei on 16-1-7.
 */
public interface IIterator {
    Object next();

    boolean hasNext();

    Object first();

    Object previous();
}
