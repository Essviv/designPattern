package com.cmcc.syw.visitor;

/**
 * 具体的访问者A
 *
 * Created by sunyiwei on 2016/10/31.
 */
public class VisitorA implements Visitor {
    public void visit(ElementA elementA) {
        System.out.println("VisitorA visits ElementA");
    }

    public void visit(ElementB elementB) {
        System.out.println("VisitorA visits ElementB");
    }
}
