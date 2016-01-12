package com.cmcc.syw.mediator;

/**
 * 中介者模式的实现代码
 *
 * 现实中,可以把QQ群和Java容器(Spring)等看成是一种中介者模式的实例
 *
 * 这个模式的核心思想是实现对象间的解耦,通过中介者对对象进行统一的管理
 *
 * Created by sunyiwei on 16-1-8.
 */
public interface Mediator {
    void info(Person sendPerson, String content, Person targetPerson);

    void infoAll(Person sendPerson, String content);

    void add(Person person);
}
