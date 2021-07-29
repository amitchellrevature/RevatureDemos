package com.alec.day4;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Stacy");
        names.add("Watson");
        System.out.println(names);

        System.out.println(names.get(1));

        names.add(1, "John");
        System.out.println(names);

        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Rangel");
        newNames.add("Smith");

        names.addAll(0, newNames);

        System.out.println(names);

        System.out.println(names);

        System.out.println(names);

        names.removeAll(newNames);
        System.out.println(names);

        names.removeIf(name -> name.contains("Paul"));
        System.out.println(names);


    }
}
