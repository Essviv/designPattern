package com.cmcc.syw.chain;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class HandlerImpl extends AbstractHandler {
    public HandlerImpl(String name) {
        super(name);
    }

    public void operate() {
        System.out.println("Hello world from " + getName());

        //这里是调用链上的下一个对象进行处理
        Handler handler = getHandler();
        if (handler != null) {
            handler.operate();
        }
    }

    public static void main(String[] args) {
        AbstractHandler handler = new HandlerImpl("First");
        AbstractHandler secondHandler = new HandlerImpl("Second");
        AbstractHandler thirdHandler = new HandlerImpl("Third");

        handler.setHandler(secondHandler);
        secondHandler.setHandler(thirdHandler);
        handler.operate();
    }
}
