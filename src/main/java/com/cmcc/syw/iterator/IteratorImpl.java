package com.cmcc.syw.iterator;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class IteratorImpl implements IIterator {
    ICollection collection;
    private int pos = -1;

    public IteratorImpl(ICollection collection) {
        this.collection = collection;
        pos = -1;
    }

    public Object next() {
        return collection.get(++pos);
    }

    public boolean hasNext() {
        return pos < collection.size() - 1;
    }

    public Object first() {
        pos = 0;
        return collection.get(pos);
    }

    public Object previous() {
        return collection.get(pos - 1);
    }
}
