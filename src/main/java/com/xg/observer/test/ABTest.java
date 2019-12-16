package com.xg.observer.test;

/**
 * @program: observer
 * @description:
 * @author: gzk
 * @create: 2019-12-16 15:01
 **/
public class ABTest {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.addObserver(b);

        a.push("12123123");

    }
}
