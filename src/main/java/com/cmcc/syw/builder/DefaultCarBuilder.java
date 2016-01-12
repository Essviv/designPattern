package com.cmcc.syw.builder;

import com.cmcc.syw.common.*;

/**
 * 默认的汽车类的实现
 * Created by sunyiwei on 16-1-5.
 */
public class DefaultCarBuilder implements CarBuilder {
    private Car car = new Car();

    public void buildEngine() {
        car.setEngine(new AudiEngine());
    }

    public void buildWheel() {
        car.setWheel(new BenzWheel());
    }

    public void bulidCabin() {
        car.setCabin(new BmwCabin());
    }

    public Car getCar() {
        return car;
    }
}
