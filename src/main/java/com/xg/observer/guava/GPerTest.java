package com.xg.observer.guava;

import com.xg.observer.gper.Question;
import com.xg.observer.gper.v1.Gper;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 15:47
 **/
public class GPerTest {

    public static void main(String[] args) {
        Question question = new Question();
        question.setName("小明");
        question.setContent("我是谁？");
        GPer gPer = GPer.getInstance();
        try {
            gPer.push(Teacher.class,question);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
