package com.neu.hzm.Proxy;

/**
 * Created by Administrator on 2015/10/15 0015.
 */
public class Proxydemo {

    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.doSomething();
        subject.doSomethingElse();
    }
}
