package com.alec.day4;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> colors = init();
        iterate(colors);
        insert(colors, "yellow");
        System.out.println(fetch(colors, 1) + "\n");
        update(colors, "yellow", "orange");
    }

    public static ArrayList<String> init(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("\nArrayList has been created\n");
        return colors;
    }

    public static void iterate(ArrayList<String> colors){
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
        System.out.println();
    }

    public static void insert(ArrayList<String> colors, String newColor) {
        colors.add(newColor);
        System.out.println(newColor + " has been added to the list\n");
    }

    public static String fetch(ArrayList<String> colors, int position) {
        return colors.get(position);
    }

    public static void update(ArrayList<String> colors, String element, String newElement) {
        for(int i = 0; i < colors.size(); i++){
            if(colors.get(i).equals(element))
                colors.set(i, newElement);
        }
        System.out.println(element + " had been replaced with " + newElement);
    }
}
