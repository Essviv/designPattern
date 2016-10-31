package com.cmcc.syw.visitor;

/**
 * 访问者模式中的元素接口
 *
 * Created by sunyiwei on 2016/10/31.
 */
public interface Element {
    void accept(Visitor visitor);
}
