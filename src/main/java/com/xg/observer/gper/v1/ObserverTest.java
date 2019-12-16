package com.xg.observer.gper.v1;

import com.xg.observer.gper.Question;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 11:45
 **/
public class ObserverTest {

    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Teacher xg = new Teacher("xg");
        gper.addObserver(xg);

        Question question =new Question();
        question.setContent("我是谁？我在哪？");
        question.setName("小明");
        gper.publishQuestion(question);
    }
}
