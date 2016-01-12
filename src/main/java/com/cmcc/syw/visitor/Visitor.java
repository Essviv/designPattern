package com.cmcc.syw.visitor;

/**
 * 访问者模式
 *
 * 这个模式的核心思想是把数据结构和操作数据结构的算法分开,特别适用于数据结构稳定,而数据算法易变的场景
 *
 * Created by sunyiwei on 16-1-8.
 */
public interface Visitor {
    void visit(Subject subject);
}
