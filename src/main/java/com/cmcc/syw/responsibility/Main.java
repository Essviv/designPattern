package com.cmcc.syw.responsibility;

/**
 * Created by sunyiwei on 2016/11/30.
 */
public class Main {
    public static void main(String[] args) {
        LinkedRequestHandler linkedRequestHandlerA = new LinkedRequestHandlerImplA();
        LinkedRequestHandler linkedRequestHandlerB = new LinkedRequestHandlerImplB();

        RequestHandlerChain chain = new RequestHandlerChain();
        chain.addFirst(linkedRequestHandlerA);
        chain.addFirst(linkedRequestHandlerB);

        Request requestA = new RequestImplA();
        Request requestB = new RequestImplB();
        Request requestC = new RequestImplC();

        chain.processRequest(requestA);
        chain.processRequest(requestB);
        chain.processRequest(requestC);
    }
}
