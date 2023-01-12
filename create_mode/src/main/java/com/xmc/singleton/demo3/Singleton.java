package com.xmc.singleton.demo3;

public class Singleton {

    /**
     * 私有构造方法
     */
    private Singleton (){

    }

    private static Singleton instance;

    /**
     * 这样线程不安全，假如一个进入判断放弃cpu执行权
     * 那个线程也是，这样就不是单例了
     * 加个同步锁就可以了
     *synchronized
     * @return
     */
    public static synchronized Singleton getInstance(){

        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
