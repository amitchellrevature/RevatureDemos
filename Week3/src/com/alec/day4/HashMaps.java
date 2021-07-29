package com.alec.day4;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        add(map, "red", 1);
        add(map,"blue", 2);
        add(map, "yellow", 3);
        count(map);
        HashMap<String, Integer> newMap = copy(map);

    }

    public static void add(HashMap<String, Integer> map, String s, int i){
        map.put(s, i);
        System.out.println("Object \"" + s + "\" has been added with a key value of " + i);
    }

    public static void count(HashMap<String, Integer> map){
        System.out.println("This hashmap has " + map.size() + " pairings");
    }

    public static HashMap<String, Integer> copy(HashMap<String, Integer> map){
        HashMap<String, Integer> newMap = new HashMap<String, Integer>(map);
        System.out.println("New hashmap has been copied");
        return newMap;
    }
}
