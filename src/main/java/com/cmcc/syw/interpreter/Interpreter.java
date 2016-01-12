package com.cmcc.syw.interpreter;

/**
 * 解析器模式的实现代码
 *
 * 这个模式的思想是通过专门的解析接口对上下文进行解析,解析的方法由具体的实现定义
 *
 * Created by sunyiwei on 16-1-8.
 */
public interface Interpreter {
    void interpret(IContext context);
}
