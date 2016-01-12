package com.cmcc.syw.bridge;

/**
 * Created by sunyiwei on 16-1-6.
 */
public class DriverBridgeImpl implements DriverBridge{
    private Driver driver;

    public DriverBridgeImpl(Driver driver) {
        this.driver = driver;
    }


    public void connect() {
        System.out.println(driver.getName());
    }

    public static void main(String[] args) {
        DriverBridge driverBridge = new DriverBridgeImpl(
                new FirstDriverImpl()
        );
        driverBridge.connect();

        driverBridge = new DriverBridgeImpl(
                new SecondDriverImpl()
        );
        driverBridge.connect();
    }
}
