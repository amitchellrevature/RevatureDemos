package com.alec.day4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo14 {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Mark");
        deque.add("Paul");
        deque.add("Watson");

        for(String name: deque){
            System.out.println(name);
        }

    }
}
