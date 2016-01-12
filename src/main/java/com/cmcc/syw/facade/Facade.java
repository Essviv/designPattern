package com.cmcc.syw.facade;

/**
 * 外观模式的实现代码
 *
 * 设计模式的特点是将复杂的内部实现隐藏起来,将统一又简单的外观暴露给外部使用
 *
 * Created by sunyiwei on 16-1-6.
 */
public class Facade {
    private Disk disk;
    private CPU cpu;
    private Memory memory;

    public Facade(Disk disk, CPU cpu, Memory memory) {
        this.disk = disk;
        this.cpu = cpu;
        this.memory = memory;
    }

    public void start(){
        disk.start();
        cpu.start();
        memory.start();
    }

    public void stop(){
        disk.stop();
        cpu.stop();
        memory.stop();
    }

    public static void main(String[] args) {
        Facade facade = new Facade(
                new DiskImpl(), new CPUImpl(), new MemoryImpl()
        );

        facade.start();
        System.out.println("====================");
        facade.stop();
    }
}
