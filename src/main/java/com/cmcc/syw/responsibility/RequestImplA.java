package com.cmcc.syw.responsibility;

/**
 * Created by sunyiwei on 2016/11/30.
 */
public class RequestImplA implements Request {
    public String getTypeName() {
        return LinkedRequestHandlerImplA.class.getSimpleName();
    }
}
