package com.cmcc.syw.proxy.dynamic.clazz;

import com.cmcc.syw.proxy.ISource;
import com.cmcc.syw.proxy.SourceImpl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理 - 类代理,使用cglib
 *
 * Created by sunyiwei on 2017/4/22.
 */
public class CglibSourceImpl {
    public static void main(String[] args) {
        ISource source = new SourceImpl();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ISource.class);
        enhancer.setCallback(new CustomCallback(source));

        ISource proxy =(ISource) enhancer.create();
        proxy.say();
    }

    private static class CustomCallback implements MethodInterceptor {
        private final ISource iSource;

        public CustomCallback(ISource iSource) {
            this.iSource = iSource;
        }

        /**
         * All generated proxied methods call this method instead of the original method. The
         * original method may either be invoked by normal reflection using the Method object, or by
         * using the MethodProxy (faster).
         *
         * @param obj    "this", the enhanced object
         * @param method intercepted Method
         * @param args   argument array; primitive types are wrapped
         * @param proxy  used to invoke super (non-intercepted method); may be called as many times
         *               as needed
         * @return any value compatible with the signature of the proxied method. Method returning
         * void will ignore this value.
         * @throws Throwable any exception may be thrown; if so, super method will not be invoked
         * @see MethodProxy
         */
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            System.out.println("Hello world from cglib proxy.");
            return method.invoke(iSource, args);
        }
    }
}
