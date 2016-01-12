package com.cmcc.syw.chain;

/**
 * 责任链模式的实现代码
 *
 * 这个模式的核心是链上每个对象都实现同样的接口,同时也指向链上的另一个对象(链尾对象则为空)
 * J2EE中过滤器的实现可以认为是一种责任链模式
 *
 * Created by sunyiwei on 16-1-7.
 */
public interface Handler {
    void operate();
}
