package com.cmcc.syw.proxy;

/**
 * Created by sunyiwei on 2017/4/22.
 */
public class SourceImpl implements ISource, ISource2{
    public void say() {
        System.out.println("hello world from sourceImpl.");
    }

    public void test() {
        System.out.println("test from sourceImpl");
    }
}
