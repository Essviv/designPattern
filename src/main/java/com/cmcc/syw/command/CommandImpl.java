package com.cmcc.syw.command;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class CommandImpl implements Command {
    private Receiver receiver;

    public CommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    public void command() {
        System.out.println("Command has received command, now info to receiver.");
        receiver.action();
    }
}
