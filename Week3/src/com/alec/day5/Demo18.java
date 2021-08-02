package com.alec.day5;

import java.io.File;

public class Demo18 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db");
        String[] list = file.list();
        for(String s: list){
            count++;
            System.out.println(s);
        }

        System.out.println("Total number of file and folder = "+ count);
    }
}
