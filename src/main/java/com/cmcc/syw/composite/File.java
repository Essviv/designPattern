package com.cmcc.syw.composite;

/**
 * 组合模式的实现代码
 * 这种设计模式特别适合于"整体-部分"的数据结构,简单地说,特别适合于能够用树结构表示的数据
 *
 * 抽象接口,文件的抽象接口
 *
 * Created by sunyiwei on 16-1-6.
 */
public interface File {
    void selfExplain(String prefix);

    void add(File file);
}
