package com.xg.observer.test;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 15:01
 **/
public class B implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o);
        System.out.println(arg);
    }
}
