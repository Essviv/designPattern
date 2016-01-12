package com.cmcc.syw.composite;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class FileImpl implements File {
    private String name;

    public FileImpl(String name) {
        this.name = name;
    }

    public void add(File file) {
        return;
    }

    public void selfExplain(String prefix) {
        System.out.println(prefix + name);
    }
}
