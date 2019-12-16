package com.xg.observer.gper.v1;

import com.xg.observer.gper.Question;

import java.util.Observable;

/**
 * @program: observer
 * @description: go
 * @author: gzk
 * @create: 2019-12-16 11:28
 **/
public class Gper extends Observable {

    private static final String NAME = "GPer生态圈";

    private static Gper gper = null;


    public static Gper getInstance(){
        if(null == gper){ gper = new Gper();}
        return gper;
    }

    public String getName(){
        return NAME;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getName() + "在" + NAME + "上提交了一个问题");
        new Thread(
                ()->{
                    setChanged();
                    notifyObservers(question);
                }
        ).start();
    }

}
