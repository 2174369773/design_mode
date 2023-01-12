package com.xmc.demo4.before;

public class XmcSafetDoor implements SafetyDoor{

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
    }
}
