package com.xg.observer.test;

import java.util.Observable;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 15:00
 **/
public class A extends Observable {


    public void push(String id){
        setChanged();
        notifyObservers(id);
    }

}
