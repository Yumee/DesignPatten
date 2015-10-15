package com.neu.hzm.Proxy;

/**
 * Created by Administrator on 2015/10/15 0015.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("real subject do something");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("real subject do something else");
    }
}
