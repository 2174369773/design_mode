package com.xmc.demo3.after;

/**
 * 依赖倒装原则，易于扩展
 */
public class Computer {

    //声明接口，new 它的实现类
    private HardDisk hardDisk;

    private Cpu cpu;

    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
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
