package com.cmcc.syw.flyweight;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class FlyWeightFactory {
    private static List<FlyWeight> flyWeights;

    static {
        flyWeights = new LinkedList<FlyWeight>();
        final int count = 10;
        for (int i = 0; i < count; i++) {
            flyWeights.add(new FlyWeightImpl());
        }
    }

    private static Object getLock = new Object();
    private static Object releaseLock = new Object();

    public static FlyWeight get() {
        synchronized (getLock) {
            if (!flyWeights.isEmpty()) {
                return flyWeights.remove(0);
            }
        }

        return null;
    }

    public static void release(FlyWeight flyWeight) {
        synchronized (releaseLock) {
            flyWeights.add(flyWeight);
        }
    }

    public static void main(String[] args) {
        final int count = 100;
        ExecutorService service = Executors.newFixedThreadPool(count);
        for (int i = 0; i <count ; i++) {
           service.execute(new Runnable() {
               public void run() {
                   FlyWeight flyWeight = FlyWeightFactory.get();
                   if(flyWeight!=null){
                       System.out.println(Thread.currentThread().getName() + ": " + flyWeight.getName());
                       FlyWeightFactory.release(flyWeight);
                   }
               }
           });
        }

    }
}
