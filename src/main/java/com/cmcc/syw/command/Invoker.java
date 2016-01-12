package com.cmcc.syw.command;

/**
 * 命令者模式的实现代码
 *
 * 这种模式的核心思想是通过命令接口,将发布者和执行者解耦
 *
 * Created by sunyiwei on 16-1-7.
 */
public interface Invoker {
    void invoke();
}
