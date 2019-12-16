package com.xg.observer.guava;

import com.google.common.eventbus.EventBus;
import com.xg.observer.gper.Question;
import com.xg.observer.gper.v1.Gper;
import sun.text.normalizer.UBiDiProps;

import java.util.HashMap;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 15:35
 **/
public class GPer {

    private static final String NAME = "GPer生态圈";

    private static GPer gper = null;


    public static GPer getInstance(){
        if(null == gper){ gper = new GPer();}
        return gper;
    }

    public String getName(){
        return NAME;
    }

    public void push(Class clazz,Question question) throws Exception {
        System.out.println(question.getName() + "在" + NAME + "上提交了一个问题");
        EventBus bus = new EventBus();
        bus.register((Teacher)clazz.newInstance());

        HashMap<String, Object> map = new HashMap<>();
        map.put("clazz",this);
        map.put("question",question);
        bus.post(map);
    }
}
