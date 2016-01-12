package com.cmcc.syw.observer;

/**
 * Created by sunyiwei on 16-1-7.
 */
public interface ISubject {
    void add(IObserver observer);

    void delete(IObserver observer);

    void operate();

    void notifyObservers();
}
