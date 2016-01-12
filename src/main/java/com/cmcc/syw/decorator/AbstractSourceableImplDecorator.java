package com.cmcc.syw.decorator;

/**
 * 装饰者
 *
 * 注意这里的实现方式
 * 1. 装饰者应该与被装饰者实现同样的接口
 * 2. 装饰者应该持有被装饰者的对象引用
 *
 * Created by sunyiwei on 16-1-6.
 */
public abstract  class AbstractSourceableImplDecorator implements Sourceable {
    protected Sourceable sourceable;

    protected AbstractSourceableImplDecorator(Sourceable sourceable){
       this.sourceable = sourceable;
    }
}
