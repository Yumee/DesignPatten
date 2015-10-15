package com.neu.hzm.Proxy;

/**
 * Created by Administrator on 2015/10/15 0015.
 */
public class ProxySubject implements Subject {

    private Subject subject ;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        System.out.println("proxy subject do something");
        subject.doSomething();
    }

    @Override
    public void doSomethingElse() {
        System.out.println("proxy subject do something");
        subject.doSomethingElse();
    }
}
