package com.cmcc.syw.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Visitor模式的测试类
 *
 * Created by sunyiwei on 2016/10/31.
 */
public class VisitorTest {
    public static void main(String[] args) {
        testVisitorA();

        System.out.println("++++++++++++");

        testVisitorB();
    }

    private static void testVisitorB() {
        Visitor visitor = new VisitorB();
        List<Element> elems = buildElements();
        for (Element elem : elems) {
            elem.accept(visitor);
        }
    }

    private static void testVisitorA() {
        Visitor visitor = new VisitorA();
        List<Element> elems = buildElements();
        for (Element elem : elems) {
            elem.accept(visitor);
        }
    }

    private static List<Element> buildElements() {
        List<Element> elems = new LinkedList<Element>();
        elems.add(new ElementA());
        elems.add(new ElementB());

        return elems;
    }
}
