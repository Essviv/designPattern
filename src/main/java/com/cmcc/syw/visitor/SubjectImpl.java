package com.cmcc.syw.visitor;

/**
 * 在访问者模式中,这个类代表的是相对固定的数据结构, 而访问者代表的是相对易变的数据操作算法
 *
 * Created by sunyiwei on 16-1-8.
 */
public class SubjectImpl implements Subject {
    private String name;

    public SubjectImpl(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Subject subject = new SubjectImpl("sunyiwei");
        subject.accept(new VisitorImpl());

        //从这里可以看出,对于访问者模式来讲,增加一种新的操作算法是非常容易的,但如果想要更改数据结构,则要麻烦很多
        subject.accept(new Visitor() {
            public void visit(Subject subject) {
                System.out.println("Hello world, I'm visiting " + subject.getName());
            }
        });
    }
}
