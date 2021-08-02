package com.alec.day5;

class Table2{
    public void printTable(int number){
        synchronized (this){
            for(int i=0;i<10;i++){
                System.out.println(number * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread11 extends  Thread{
    Table2 table;
    public MyThread11(Table2 table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread12 extends  Thread{
    Table2 table;
    public MyThread12(Table2 table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Table2 table2 = new Table2();
        MyThread11 t1 = new MyThread11(table2);
        MyThread12 t2 = new MyThread12(table2);

        t1.start();
        t2.start();
    }
}
