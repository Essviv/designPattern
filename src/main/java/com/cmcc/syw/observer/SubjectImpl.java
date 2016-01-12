package com.cmcc.syw.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class SubjectImpl implements ISubject{
    List<IObserver> observers = new LinkedList<IObserver>();

    public void add(IObserver observer) {
        observers.add(observer);
    }

    public void delete(IObserver observer) {
        observers.remove(observer);
    }

    public void operate() {
        System.out.println("Hello world from subject.");
        notifyObservers();
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
           observer.update();
        }
    }
}
