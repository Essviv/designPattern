package com.cmcc.syw.visitor;

/**
 * 具体的访问者B
 *
 * Created by sunyiwei on 2016/10/31.
 */
public class VisitorB implements Visitor {
    public void visit(ElementA elementA) {
        System.out.println("VisitorB visits ElementA");
    }

    public void visit(ElementB elementB) {
        System.out.println("VisitorB visits ElementB");
    }
}
