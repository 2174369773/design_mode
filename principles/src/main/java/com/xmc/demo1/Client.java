package com.xmc.demo1;

/**
 * 开闭原则测试
 * 定义抽象类
 * 继承抽象类，实现它的方法
 * 这样可以实现功能扩展
 */
public class Client {

    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();
        //默认皮肤类
        souGouInput.setAbstractSkin(new DefaultSkin());
        souGouInput.display();

        //xmc皮肤类
        souGouInput.setAbstractSkin(new XmcSkin());
        souGouInput.display();
    }
}
