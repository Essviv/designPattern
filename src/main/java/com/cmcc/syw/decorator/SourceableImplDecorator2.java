package com.cmcc.syw.decorator;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class SourceableImplDecorator2 extends AbstractSourceableImplDecorator{
    public SourceableImplDecorator2(Sourceable sourceable) {
        super(sourceable);
    }

    public void saySomething() {
        System.out.println("Hello world from decorator2.");
       this.sourceable.saySomething();
    }
}
