package com.cmcc.syw.decorator;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class SourceableImplDecorator extends AbstractSourceableImplDecorator {

    public SourceableImplDecorator(Sourceable sourceable) {
        super(sourceable);
    }

    public void saySomething() {
        System.out.println("Hello world from decorator.");
        this.sourceable.saySomething();
    }

    public static void main(String[] args) {
        Sourceable sourceable =
                new SourceableImplDecorator(
                        new SourceableImplDecorator2(
                                new SourceableImpl()
                        )
                );

        sourceable.saySomething();
    }
}
