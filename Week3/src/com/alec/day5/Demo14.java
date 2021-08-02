package com.alec.day5;

class Company {
    int item;
    boolean flag = false;

    synchronized void produce(int item) throws InterruptedException {
        if (flag) {
            wait();
        }
        this.item = item;
        System.out.println("Produced: " + this.item);
        flag = true;
        notify();
    }

    synchronized int consume() throws InterruptedException {
        if (!flag) {
            wait();
        }
        System.out.println("Consumer: " + item);
        flag = false;
        notify();
        return this.item;
    }
}

class Producer extends Thread {
    Company company;

    Producer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        int i = 1;
        try {
            this.company.produce(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    Company company;

    Consumer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        int i=1;
        try {
            this.company.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo14 {
    public static void main(String[] args) {
        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);

        producer.start();
        consumer.start();
    }
}
