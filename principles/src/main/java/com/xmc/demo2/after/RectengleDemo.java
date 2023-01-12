package com.xmc.demo2.after;

/**
 * 里氏替换原则：
 * 可以添加新的功能完成扩展，但是不能重写父类方法
 *将有开通特性的
 */
public class RectengleDemo {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        resize(r);
        printLengthAndWidth(r);
        System.out.println("-----------------");

        Square s = new Square();
        s.setSize(10);
        //扩宽
        printLengthAndWidth(s);

    }

    //扩宽方法
    public static void resize(Rectangle rectangle){
       while (rectangle.getWidth() <= rectangle.getLength()){
           rectangle.setWidth(rectangle.getWidth()+1);
       }
    }

    //打印长和宽
    public static void printLengthAndWidth(Quadrilateral r){
        System.out.println("长:"+r.getLength()+"宽:"+r.getWidth());
    }

}
