package com.cmcc.syw.proxy;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class SourceProxy implements Sourceable {
    private Source source = new Source();

    public void saySomething() {
        System.out.println("Hello world from source proxy.");
        source.saySomething();
    }

    public static void main(String[] args) {
        Sourceable sourceable = new SourceProxy();
        sourceable.saySomething();
    }
}
