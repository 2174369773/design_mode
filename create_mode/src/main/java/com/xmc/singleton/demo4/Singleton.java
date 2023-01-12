package com.xmc.singleton.demo4;

/**
 * 双重检查锁方式
 * @author 谢孟呈
 * 添加volatile关键字后得双重检查锁模式是一种比较好的单例实现方式
 * 能够保证在多线程安全也不会有性能问题
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){

        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
