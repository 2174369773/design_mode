package com.xmc.demo2.before;

public class RectengleDemo {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        resize(r);
        printLengthAndWidth(r);
        System.out.println("-----------------");

        Square s = new Square();
        s.setLength(10);
        //扩宽
        resize(s);
        printLengthAndWidth(s);

    }

    //扩宽方法
    public static void resize(Rectangle rectangle){
       while (rectangle.getWidth() <= rectangle.getLength()){
           rectangle.setWidth(rectangle.getWidth()+1);
       }
    }

    //打印长和宽
    public static void printLengthAndWidth(Rectangle r){
        System.out.println("长:"+r.getLength()+"宽:"+r.getWidth());
    }

}
