package com.cmcc.syw.command;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class ReceiverImpl implements Receiver {
    public void action() {
        System.out.println("Receiver has received command, now ready to action.");
        System.out.println("Hello world from receiver.");
    }
}
