package com.cmcc.syw.command;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new ReceiverImpl();
        Command command = new CommandImpl(receiver);
        Invoker invoker = new InvokerImpl(command);

        invoker.invoke();
    }
}
