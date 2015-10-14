package com.neu.hzm.SimpleFactory;

/**
 * Created by Administrator on 2015/10/14 0014.
 */
public class Factory {

    public void createCar(int type) {
        switch (type) {
            case 0:
                 new BMW();
                break;
            case 1:
                 new Benze();
                break;
        }
    }

}
