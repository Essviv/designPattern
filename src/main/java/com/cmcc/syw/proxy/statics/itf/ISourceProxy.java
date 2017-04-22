package com.cmcc.syw.proxy.statics.itf;

import com.cmcc.syw.proxy.ISource;
import com.cmcc.syw.proxy.SourceImpl;

/**
 * 静态代理 - 接口代理
 *
 * Created by sunyiwei on 2017/4/22.
 */
public class ISourceProxy implements ISource {
    private final ISource proxied;

    public ISourceProxy(ISource proxied) {
        this.proxied = proxied;
    }

    public void say() {
        System.out.println("hello world from ISourceProxy.");
        proxied.say();
    }

    public static void main(String[] args) {
        ISource iSource = new ISourceProxy(new SourceImpl());
        iSource.say();
    }
}
