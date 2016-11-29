package com.cmcc.syw.state;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class FirstStateImpl implements State {
    public void sayHello(int count) {
        System.out.println(FirstStateImpl.class.getSimpleName() + ": " + count);
    }
}
