package com.cmcc.syw.command;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class InvokerImpl implements Invoker {
    private Command command;

    public InvokerImpl(Command command) {
        this.command = command;
    }

    public void invoke() {
        System.out.println("Invoker has invoke command.");
        command.command();
    }
}
