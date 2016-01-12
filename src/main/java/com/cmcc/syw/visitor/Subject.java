package com.cmcc.syw.visitor;

/**
 * Created by sunyiwei on 16-1-8.
 */
public interface Subject {
    void accept(Visitor visitor);

    String getName();
}
