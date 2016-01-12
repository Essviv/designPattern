package com.cmcc.syw.visitor;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class VisitorImpl implements Visitor {
    public void visit(Subject subject) {
        System.out.println("Visit " + subject.getName());
    }
}
