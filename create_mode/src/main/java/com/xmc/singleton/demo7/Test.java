package com.xmc.singleton.demo7;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {

        Singleton singleton1 = readFile();
        Singleton singleton2 = readFile();

        System.out.println(singleton1 == singleton2);
    }

    public static void writeFile() throws Exception{
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));
        objectOutputStream.writeObject(instance);
    }

    public static Singleton readFile() throws Exception{

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\a.txt"));
        Singleton singleton =(Singleton) inputStream.readObject();
        return singleton;
    }
}
