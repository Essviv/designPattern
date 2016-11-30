package com.cmcc.syw.responsibility;

/**
 * 责任链模式中的处理器
 *
 * Created by sunyiwei on 2016/11/30.
 */
public interface RequestHandler {
    void processRequest(Request request);
}
