package com.xmc.singleton.demo6;

/**
 *枚举类型是线程安全的，而且只会装载一次（恶汉式）
 */
public class MainTest {
    public static void main(String[] args) {

        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
    }
}