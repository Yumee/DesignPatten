package com.neu.hzm.Proxy.CGLibProxy;

import com.neu.hzm.Proxy.RealSubject;
import com.neu.hzm.Proxy.Subject;

/**
 * Created by Administrator on 2015/10/15 0015.
 */
public class CGLibDemo {

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();

        Subject subject = (Subject)cgLibProxy.getCGLibProxyInstance(new RealSubject());

        subject.doSomething();
        subject.doSomethingElse();
    }
}
