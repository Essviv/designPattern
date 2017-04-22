package com.cmcc.syw.proxy.statics.clazz;

import com.cmcc.syw.proxy.ISource;
import com.cmcc.syw.proxy.SourceImpl;

/**
 * 静态代理 - 类代理
 *
 * Created by sunyiwei on 2017/4/22.
 */
public class SubSourceImpl extends SourceImpl {
    public static void main(String[] args) {
        ISource iSource = new SubSourceImpl();
        iSource.say();
    }

    @Override
    public void say() {
        System.out.println("hello world from subSourceImpl.");
        super.say();
    }
}
