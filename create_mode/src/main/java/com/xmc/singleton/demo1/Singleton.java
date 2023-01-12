package com.xmc.singleton.demo1;

/**
 * 单例模式中得
 * 饿汉式（静态方法实现）
 * 饿汉式类的加载得时候就会就会导致该单实例对象被创建
 */
public class Singleton {

    //私有构造方法，保证外界访问不到
    private Singleton(){}

    //创建实例代码并且暴露接口
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
