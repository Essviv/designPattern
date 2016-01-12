package com.cmcc.syw.prototype;

import java.io.*;

/**
 * 原型模式, 顾名思义,该模式是通过拷贝的方式来创建对象
 * 实现的过程中,要注意深浅拷贝的区别
 *
 * Created by sunyiwei on 16-1-5.
 */
public class Prototype implements Cloneable, Serializable {
    private String name;
    private float height;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //deep copy
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype a = new Prototype();
        a.setName("sunyiwei");
        a.setHeight(1.8F);

        Prototype b = (Prototype)a.clone();
        System.out.println(a == b);
        System.out.println(b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Height: " + height;
    }
}
