package com.xmc.demo4.after;

/**
 * 接口隔离原则，就是把接口尽可能得细化，满足继承这个接口，只要
 * 实现我想要得方法就可以了
 */
public class XmcSafetDoor implements AntiTheft,FireProof,WaterProof{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }

    public static void main(String[] args) {
        XmcSafetDoor xmcSafetDoor = new XmcSafetDoor();
        xmcSafetDoor.antiTheft();
        xmcSafetDoor.waterProof();
        xmcSafetDoor.fireProof();

        System.out.println("====================");
        XmcPlusSaferDoor saferDoor = new XmcPlusSaferDoor();
        saferDoor.antiTheft();
        saferDoor.fireProof();
    }
}
