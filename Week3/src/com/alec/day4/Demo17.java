package com.alec.day4;

import java.util.Hashtable;
import java.util.Map;

public class Demo17 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Mark");
        hashtable.put(2, "Paul");
        hashtable.put(3, "Watson");
        hashtable.put(4, "John");

        for(Map.Entry entry: hashtable.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
