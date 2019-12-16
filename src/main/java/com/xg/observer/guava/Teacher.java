package com.xg.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.xg.observer.gper.Question;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 15:44
 **/
public class Teacher {

    @Subscribe
    public void getSubscribe(Map<String ,Object> map) throws Exception{
        GPer clazz =(GPer) map.get("clazz");
        Question question =(Question) map.get("question");
        System.out.println("============================");
        System.out.println("老师，你好！\n" +
                "您收到一个来自【 " + clazz.getName() + " 】提交的一个问题，内容如下：\n"+
                question.getContent() + "\n" +
                "提问者：" + question.getName());
    }

}
