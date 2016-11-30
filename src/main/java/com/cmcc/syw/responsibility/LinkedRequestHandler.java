package com.cmcc.syw.responsibility;

/**
 * 双向链表实现的请求处理器
 *
 * Created by sunyiwei on 2016/11/30.
 */
public abstract class LinkedRequestHandler implements RequestHandler {
    private LinkedRequestHandler prev;
    private LinkedRequestHandler next;

    public LinkedRequestHandler getPrev() {
        return prev;
    }

    public void setPrev(LinkedRequestHandler prev) {
        this.prev = prev;
    }

    public LinkedRequestHandler getNext() {
        return next;
    }

    public void setNext(LinkedRequestHandler next) {
        this.next = next;
    }

    public void processRequest(Request request) {
        System.out.println(getTypeName() + ": Process request!");
    }

    protected boolean canProcess(Request request) {
        return getTypeName().equals(request.getTypeName());
    }

    protected abstract String getTypeName();

}
