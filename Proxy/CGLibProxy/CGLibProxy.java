package com.neu.hzm.Proxy.CGLibProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/10/15 0015.
 */
public class CGLibProxy implements MethodInterceptor {

    private Object target ;

    public Object getCGLibProxyInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("object "+o.getClass()+" method "+method.getName()+" methodProxy "+methodProxy);

        System.out.println("before cglib method ");

//        调用realsubject的方法
        methodProxy.invokeSuper(o,objects);

        System.out.println("after cglib method");

        return  null;
    }
}
