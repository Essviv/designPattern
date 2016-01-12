package com.cmcc.syw.builder;

/**
 * 建造者模式中的引导者,它的作用是引导整个创建的过程,至于说具体的创建过程,由builder类负责
 *
 * Created by sunyiwei on 16-1-5.
 */
public class Director {
    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void construct(){
        carBuilder.bulidCabin();
        carBuilder.buildWheel();
        carBuilder.buildEngine();
    }

    public static void main(String[] args) {
        CarBuilder carBuilder = new DefaultCarBuilder();
        Director director = new Director(carBuilder);

        //建造复杂对象
        director.construct();
        System.out.println(carBuilder.getCar());
    }
}
