package com.neu.hzm.AbstractFatory;

/**
 * Created by Administrator on 2015/10/14 0014.
 */
public class BENZEFactory implements Factory {
    @Override
    public void creatCar() {
        new BENZE();
    }

    @Override
    public void creatWheel() {
        new BENZEWheel();
    }
}
