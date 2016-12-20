package com.cmcc.syw.iterator;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

/**
 * 集合类的实现
 *
 * Created by sunyiwei on 2016/12/20.
 */
public class AggregateImpl<T> implements Aggregate<T> {
    private Object[] objs = null;
    private int size;

    public AggregateImpl(Collection<T> collections) {
        size = collections.size();
        objs = new Object[size];

        int index = 0;
        for (T collection : collections) {
            objs[index++] = collection;
        }
    }

    public static void main(String[] args) {
        Collection<Integer> ints = init();
        Aggregate<Integer> aggregate = new AggregateImpl<Integer>(ints);
        Iterator<Integer> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static Collection<Integer> init() {
        final int COUNT = 5;
        Collection<Integer> collection = new LinkedList<Integer>();
        Random r = new Random();
        for (int i = 0; i < COUNT; i++) {
            collection.add(r.nextInt(10000));
        }

        return collection;
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new IteratorImpl<T>(this);
    }

    private class IteratorImpl<T> implements Iterator<T> {
        private final Aggregate<T> aggregate;
        private int cursor = 0;

        public IteratorImpl(Aggregate<T> aggregate) {
            this.aggregate = aggregate;
        }

        public boolean hasNext() {
            return cursor != aggregate.size();
        }

        public T next() {
            return (T) objs[cursor++];
        }
    }
}
