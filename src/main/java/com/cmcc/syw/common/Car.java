package com.cmcc.syw.common;

/**
 * Created by sunyiwei on 16-1-5.
 */
public class Car {
    private Engine engine;
    private Cabin cabin;
    private Wheel wheel;

    public Engine getEngine() {
        return engine;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.getName() +
                ", cabin=" + cabin.getName() +
                ", wheel=" + wheel.getName() +
                '}';
    }
}
