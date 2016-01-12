package com.cmcc.syw.memento;

/**
 * 备忘录模式的实现代码
 *
 * 这个模式实现的思想是"备份-恢复",将需要维持的状态备份至某个地方,在需要的时候再进行恢复
 *
 * Created by sunyiwei on 16-1-8.
 */
public class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Memento backup() {
        return new Memento(name);
    }

    public void restore(Memento memento){
        this.name = memento.getValue();
    }

    public static void main(String[] args) {
        Subject firstSubject = new Subject("Sunyiwei");
        Subject secondSubject = new Subject("Patrick");

        //备份
        Storage storage = new Storage();
        storage.add("sunyiwei", firstSubject.backup());
        storage.add("patrick", secondSubject.backup());
        System.out.println("FirstSubject: " + firstSubject.getName());
        System.out.println("SecondSubject: " + secondSubject.getName());

        //恢复
        firstSubject.restore(storage.remove("patrick"));
        secondSubject.restore(storage.remove("sunyiwei"));
        System.out.println("FirstSubject: " + firstSubject.getName());
        System.out.println("SecondSubject: " + secondSubject.getName());
    }
}
