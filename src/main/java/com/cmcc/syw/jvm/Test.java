package com.cmcc.syw.jvm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class Test {
    private static Test HOOK = null;

    public static void main(String[] args) throws InterruptedException, IOException {
//        test1();
//        try {
//            test2();
//        }catch (Throwable e){
//            System.out.println(Test.stackDepth);
//        }
//        test3();
//        test4();
//        test5();
        test6();
//        test7();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize is executed.");
        HOOK = this;
    }

    private static void isAlive(){
        System.out.println("I'm still alive.");
    }

    private static void test5() throws InterruptedException {
        HOOK = new Test();

        //这里会触发finalize方法,但这次对象自救成功
        HOOK = null;
        System.gc();
        Thread.sleep(500);
        if(HOOK!=null){
            isAlive();
        }else{
            System.out.println("Oh, no! I'm dead!");
        }


        //这里也会触发垃圾回收,但finalize并没有被触发,所以对象自救失败了
        HOOK = null;
        System.gc();
        Thread.sleep(500);
        if(HOOK!=null){
            isAlive();
        }else{
            System.out.println("Oh, no! I'm dead!");
        }
    }

    //测试堆内存溢出, -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
    private static void test1() {
        List<Object> objects = new LinkedList<Object>();
        while (true) {
            objects.add(new Object());
        }
    }

    //测试虚拟机栈深度溢出,-Xss256k
    private static int stackDepth = 0;

    private static void test2() {
        stackDepth++;
        test2();
    }

    //测试虚拟机栈内存溢出, -Xss1024M, 注意,这个方法的执行可能会导致机器假死,所以执行前注意备份
    private static void test3() {
        while (true) {
            new Thread(new Runnable() {
                public void run() {
                    while (true) {
                        ;
                    }
                }
            }).start();
        }
    }

    //测试方法区和常量池的内存溢出 -XX:PermSize=2M -XXMaxPermSize=2M
    private static void test4() {
        List<String> strs = new LinkedList<String>();
        int i = 0;

        while (true) {
            strs.add(String.valueOf(i++).intern());
        }
    }

    private static void test6(){
        while(true){
            ;
        }
    }

    private static void test7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        new Thread(new Runnable() {
            public void run() {
               while(true){
                   ;
               }
            }
        }, "busyThread").start();

        br.readLine();

        final Object lock = new Object();
        new Thread(new Runnable() {
            public void run() {
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "lockThread").start();
    }
}
