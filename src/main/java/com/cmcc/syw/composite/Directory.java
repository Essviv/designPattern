package com.cmcc.syw.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class Directory implements File {
    private String name;
    private List<File> subFiles = new LinkedList<File>();
    public static final String PREFIX = "...";

    public Directory(String name) {
        this.name = name;
    }

    public void selfExplain(String prefix) {
        System.out.println(prefix + name);

        prefix += PREFIX;
        for (File subFile : subFiles) {
            subFile.selfExplain(prefix);
        }
    }

    public void add(File file) {
        subFiles.add(file);
    }

    public static void main(String[] args) {
        File root = new Directory("Root");
        File dataDirectory = new Directory("DataDirectory");
        File fileDirectory = new Directory("FileDirectory");
        File textFile = new FileImpl("TextFile");
        File binayFile = new FileImpl("BinaryFile");
        File secretData = new FileImpl("SecretData");
        File publicData = new FileImpl("PublicData");


        fileDirectory.add(textFile);
        fileDirectory.add(binayFile);
        dataDirectory.add(publicData);
        dataDirectory.add(secretData);
        fileDirectory.add(dataDirectory);
        root.add(fileDirectory);

        root.selfExplain(Directory.PREFIX);
    }
}
