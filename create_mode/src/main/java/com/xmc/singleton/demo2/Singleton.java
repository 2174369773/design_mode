package com.xmc.singleton.demo2;

/**
 * 静态代码块实现饿汉式
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
