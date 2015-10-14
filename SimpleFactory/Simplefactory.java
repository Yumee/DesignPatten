package com.neu.hzm.SimpleFactory;

/**
 * Created by Administrator on 2015/10/14 0014.
 */

public class Simplefactory {

    public static void main(String[] args) {
        Factory myFactory = new Factory();
        myFactory.createCar(0);
        myFactory.createCar(1);
    }
}
