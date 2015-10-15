package com.neu.hzm.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/10/15 0015.
 */
public class DynamicProxyHandler implements InvocationHandler{

    private Object proxy ;

    public DynamicProxyHandler(Object proxy) {
        this.proxy = proxy;
        System.out.println("代理实例初始化");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("proxy "+proxy.getClass()+" method "+method.getName()+" args "+args);

        System.out.println("执行代理方法调用前");

//        调用realsubject的方法，
        method.invoke(this.proxy,args);

        System.out.println("执行代理方法调用后");

        return null;
    }
}
