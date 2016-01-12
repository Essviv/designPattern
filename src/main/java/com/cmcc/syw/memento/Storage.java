package com.cmcc.syw.memento;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class Storage {
    private Map<String, Memento> mementos = new LinkedHashMap<String, Memento>();

    public void add(String key, Memento memento){
        mementos.put(key, memento);
    }

    public Memento remove(String key){
        return mementos.remove(key);
    }
}
