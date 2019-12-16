package com.xg.observer.gper.v1;

import com.xg.observer.gper.Question;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 11:40
 **/
public class Teacher implements Observer {

    private String name;

    public Teacher(String name){
        this.name = name;
    }



    @Override
    public void update(Observable o, Object arg) {
        Gper gper = (Gper)o;
        Question question = (Question) arg;
        System.out.println("============================");
        System.out.println("老师，你好！\n" +
                "您收到一个来自【 " + gper.getName() + " 】提交的一个问题，内容如下：\n"+
                question.getContent() + "\n" +
                "提问者：" + question.getName());
    }
}
