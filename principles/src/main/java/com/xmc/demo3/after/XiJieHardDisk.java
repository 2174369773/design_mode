package com.xmc.demo3.after;

public class XiJieHardDisk implements HardDisk{


    @Override
    public void save(String data){
        System.out.println("硬盘存储数据"+data);
    }

    @Override
    public String get(){
        return "获取数据";
    }
}
