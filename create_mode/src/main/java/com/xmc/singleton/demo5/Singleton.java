package com.xmc.singleton.demo5;

/**
 * 懒汉式之静态内部类
 */
public class Singleton {

    private Singleton(){}

    private static class SingletonHolder{

        private static final Singleton instance = new Singleton();
    }

    //提供公共访问得方式
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

}
