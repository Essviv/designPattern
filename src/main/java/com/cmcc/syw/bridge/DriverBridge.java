package com.cmcc.syw.bridge;

/**
 * 桥接模式的实现代码
 *
 * 这种设计模式的好处在于,它对外提供了统一的接口,对内仍可以有不同的实现
 * 具体可以参考JDBC中driverManager的实现
 *
 * Created by sunyiwei on 16-1-6.
 */
public interface DriverBridge {
    void connect();
}
