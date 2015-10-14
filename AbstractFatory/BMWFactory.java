package com.neu.hzm.AbstractFatory;

/**
 * Created by Administrator on 2015/10/14 0014.
 */
public class BMWFactory implements Factory {
    @Override
    public void creatWheel() {
        new BMWWheel();
    }

    @Override
    public void creatCar() {
        new BMW();
    }
}
