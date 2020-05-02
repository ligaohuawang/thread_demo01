package com.lgh.controller;
//TODO A1 创建一个线程类，重写run方法
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        //TODO A2 run方法中写该线程要做的事,打印线程名和i
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
