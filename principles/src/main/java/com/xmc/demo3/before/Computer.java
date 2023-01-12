package com.xmc.demo3.before;

public class Computer {

    private XiJieHardDisk hardDisk;

    private IntelCpu cpu;

    private KingdtonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingdtonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingdtonMemory memory) {
        this.memory = memory;
    }

    public  void run(){
        hardDisk.save("11");
        hardDisk.get();
        cpu.run();
        memory.save();
    }

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setHardDisk(new XiJieHardDisk());
        computer.setMemory(new KingdtonMemory());
        computer.run();
    }
}
