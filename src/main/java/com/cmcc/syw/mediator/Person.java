package com.cmcc.syw.mediator;

/**
 * Created by sunyiwei on 16-1-8.
 */
public interface Person {
    void send(String content);

    void receive(String content);
}
