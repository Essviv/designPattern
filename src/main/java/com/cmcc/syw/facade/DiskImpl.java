package com.cmcc.syw.facade;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class DiskImpl implements Disk {
    public void start() {
        System.out.println("Disk start.");
    }

    public void stop() {
        System.out.println("Disk stop.");
    }
}
