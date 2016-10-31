package com.cmcc.syw.visitor;

/**
 * Created by sunyiwei on 2016/10/31.
 */
public class ElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
