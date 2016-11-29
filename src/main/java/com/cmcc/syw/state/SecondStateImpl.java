package com.cmcc.syw.state;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class SecondStateImpl implements State {
    public void sayHello(int count) {
        System.out.println(SecondStateImpl.class.getSimpleName() + ": " + count);
    }
}
