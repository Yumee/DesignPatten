package com.neu.hzm.Singleton;

import org.junit.Test;

/**
 * Created by Administrator on 2015/10/15 0015.
 * lazy singleton
 */
public class Singleton {

    private Singleton singleton ;

    public Singleton() {
        System.out.println("singleton");
    }

    public Singleton getSingleton(){

        if (singleton == null){
            singleton = new Singleton();
        }
        return this.singleton;
    }
    @Test
    public void testGetSingleton(){
        Singleton s1 = getSingleton();
        Singleton s2 = getSingleton();
        Singleton s3 = getSingleton();

        if (s1 == s2){
            if (s1 == s2){
                System.out.println("only one");
            }
        }

    }
}
