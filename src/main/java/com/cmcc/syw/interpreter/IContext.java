package com.cmcc.syw.interpreter;

/**
 * Created by sunyiwei on 16-1-8.
 */
public interface IContext<T> {
    T getFirstOperation();

    T getSecondOperation();
}
