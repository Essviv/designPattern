package com.cmcc.syw.responsibility;

/**
 * Created by sunyiwei on 2016/11/30.
 */
public class RequestHandlerChain implements RequestHandler {
    private LinkedRequestHandler first = null;
    private LinkedRequestHandler last = null;

    public void processRequest(Request request) {
        LinkedRequestHandler currentHandler = first;
        while (currentHandler != null) {
            if (currentHandler.canProcess(request)) {
                currentHandler.processRequest(request);
                return;
            }

            currentHandler = currentHandler.getNext();
        }

        //到这里了,说明整个链上的处理器都不能处理这个请求
        System.out.format("没有合适的处理器能处理这个请求: %s.%n", request.getTypeName());
    }

    public boolean canProcess(Request request) {
        return false;
    }

    public void addFirst(LinkedRequestHandler current) {
        if (first != null) {
            current.setNext(first);
            first.setPrev(current);

            first = current;
        } else {
            first = last = current;
            current.setNext(null);
        }

        current.setPrev(null);
    }

    public void addLast(LinkedRequestHandler current) {
        if (last != null) {
            current.setPrev(last);
            last.setNext(current);

            last = current;
        } else {
            first = last = current;
            current.setPrev(null);
        }

        current.setNext(null);
    }
}
