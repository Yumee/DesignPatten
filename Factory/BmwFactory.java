package com.neu.hzm.Factory;

/**
 * Created by Administrator on 2015/10/14 0014.
 */
public class BmwFactory extends Factory{
    @Override
    public void createCar() {
        new BMW();
    }
}
