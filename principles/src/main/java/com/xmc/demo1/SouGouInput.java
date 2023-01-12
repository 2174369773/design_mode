package com.xmc.demo1;

public class SouGouInput {

    private AbstractSkin abstractSkin;

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display(){
        abstractSkin.display();
    }
}
