package com.cmcc.syw.chain;

/**
 * Created by sunyiwei on 16-1-7.
 */
public abstract  class AbstractHandler implements Handler {
    private String name;
    private Handler handler;

    public AbstractHandler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
