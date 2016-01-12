package com.cmcc.syw.facade;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class CPUImpl implements CPU {
    public void start() {
        System.out.println("CPU start.");
    }

    public void stop() {
        System.out.println("CPU stop.");
    }
}
