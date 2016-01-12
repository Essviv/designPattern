package com.cmcc.syw.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by sunyiwei on 16-1-7.
 */
public class CollectionImpl implements ICollection<String> {

    List<String> strs = new LinkedList<String>();

    public IIterator iterator() {
       return new IteratorImpl(this) ;
    }

    public String get(int i) {
        return strs.get(i);
    }

    public int size() {
        return strs.size();
    }

    public void add(String str) {
       strs.add(str);
    }

    public static void main(String[] args) {
        ICollection collection = new CollectionImpl();
        for (int i = 0; i < 10; i++) {
           collection.add("sunyiwei_" + i);
        }

        IIterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
