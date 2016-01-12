package com.cmcc.syw.observer;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class Main {
    public static void main(String[] args) {
        ISubject subject = new SubjectImpl();
        IObserver firstObserver = new ObserverImpl("first");
        IObserver secondObserver = new ObserverImpl("second");

        subject.add(firstObserver);
        subject.add(secondObserver);

        subject.operate();
    }
}
