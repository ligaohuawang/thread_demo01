package com.lgh.controller;

public class ThreadController01 {
    public static void main(String[] args) {
        //TODO A3 创建两个线程
MyThread myThread1 = new MyThread();
MyThread myThread2 = new MyThread();
//TODO A4 启动两个线程
myThread1.start();
myThread2.start();
    }
}
