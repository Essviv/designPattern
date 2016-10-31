package com.cmcc.syw.visitor;

/**
 * 访问者模式
 *
 * 这个模式的核心思想是把数据结构和操作数据结构的算法分开,特别适用于数据结构稳定,而数据算法易变的场景
 *
 * 针对每一种具体的数据结构(这里就是ElementA, ElementB),这里都需要定义一个方法
 *
 * 从这里也可以看出,采用这种模式,数据结构必须相对稳定(因为每增加一种数据结构,都需要对具体的访问者增加实现)
 *
 * 访问者模式中还有个非常重要的概念,叫<em>双委派模式</em>
 *
 * 所谓的双委派第一次委派是在element.accept的时候,这时候会根据实际的element的实际类型进行分派
 *
 * 第二次分派则是发生在visitor.visit的时候,这时候会根据实际的visitor类型进行二次分派
 *
 *
 * Created by sunyiwei on 16-1-8.
 */
public interface Visitor {
    void visit(ElementA elementA);

    void visit(ElementB elementB);
}
