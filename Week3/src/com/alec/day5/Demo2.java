package com.alec.day5;

class MultiThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MultiThreadDemo2 threadDemo2 = new MultiThreadDemo2();
        Thread t1 = new Thread(threadDemo2);
        t1.start();
    }
}
