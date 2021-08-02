package com.alec.day5;

class TestCallRun extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun();
        TestCallRun t2 = new TestCallRun();

//        t1.start();
//        t2.start();

        t1.run();
        t2.run();
    }
}
