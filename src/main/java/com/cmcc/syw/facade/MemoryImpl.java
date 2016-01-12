package com.cmcc.syw.facade;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class MemoryImpl implements Memory {
    public void start() {
        System.out.println("Memory start.");
    }

    public void stop() {
        System.out.println("Memory stop.");
    }
}
