package com.neu.hzm.Proxy.DynamicProxy;

import com.neu.hzm.Proxy.RealSubject;
import com.neu.hzm.Proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2015/10/15 0015.
 */
public class Test {

    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject();

        Subject subject = (Subject)Proxy.newProxyInstance(
                                        Subject.class.getClassLoader(),
                                        new Class[]{Subject.class},
                                        new DynamicProxyHandler(realSubject)
                                        );
        subject.doSomething();
        subject.doSomethingElse();
    }
}
