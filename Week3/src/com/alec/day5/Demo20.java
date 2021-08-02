package com.alec.day5;

import java.io.File;

public class Demo20 {
    public static void main(String[] args) {
        File file = new File("db", "first.txt");
        file.delete();

        System.out.println(file.exists());
    }
}
