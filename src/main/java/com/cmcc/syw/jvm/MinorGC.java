package com.cmcc.syw.jvm;

/**
 * Created by sunyiwei on 16-1-12.
 */
public class MinorGC {
    public static void main(String[] args) {
        testMaxTenuringThreshold();
    }

    //-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -verbose:gc
    private static void testMinorGC() {
        final int _1MB = 1024 * 1024;
        byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new byte[_1MB * 3];
        allocation2 = new byte[_1MB * 2];
        allocation3 = new byte[_1MB * 2];
//        allocation4 = new byte[_1MB * 1];
    }

    //-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:PrintGCDetails -XX:SuvivorRatio=8
    //-XX:Pretenure
    private static void testPretenureSizeThreshold(){
        final int _1MB = 1024 * 1024;
        byte[] allocation = new byte[8* _1MB];
    }

    //-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:PrintGCDetails -XX:SuvivorRatio=8
    //-XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution
    private static void testMaxTenuringThreshold(){
        final int _1MB = 1024 * 1024;
        byte[] allocation1, allocation2, allocation3;

        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB * 4];
        allocation3 = new byte[_1MB * 4];
        allocation3 = null;
        allocation3 = new byte[_1MB * 4];
    }
}
