package com.cmcc.syw.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class MediatorImpl implements Mediator {
    List<Person> persons = new LinkedList<Person>();

    public void info(Person sendPerson, String content, Person receivePerson) {
        sendPerson.send(content);
        receivePerson.receive("收到!");
    }

    public void infoAll(Person sendPerson, String content) {
        sendPerson.send(content);
        for (Person person : persons) {
            if (person != sendPerson) {
                person.receive("收到!");
            }
        }
    }

    public void add(Person person) {
        persons.add(person);
    }

    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Person firstPerson = new Student("sunyiwei");
        Person secondPerson = new Student("patrick");
        Teacher teacher = new Teacher("teacher");

        mediator.add(teacher);
        mediator.add(firstPerson);
        mediator.add(secondPerson);

        mediator.infoAll(teacher, "明天放假,不用来上课了!");

        System.out.println("==========");
        mediator.info(firstPerson, "明天放学别走!", secondPerson);
    }
}
