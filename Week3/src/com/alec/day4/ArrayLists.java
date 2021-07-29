package com.alec.day4;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> colors = init();
        iterate(colors);
        insert(colors, "yellow");
        fetch(colors, 1);
        update(colors, "yellow", "orange");
        remove(colors, 3);
        search(colors, "orange");
        sort(colors);
        ArrayList<String> newColors = copy(colors);
        iterate(newColors);
        shuffle(colors);
        reverse(colors);
        ArrayList<String> subColors = extract(colors, 1, 2);
        iterate(subColors);
        swap(colors, 1, 2);
    }

    public static ArrayList<String> init(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("ArrayList has been created");
        return colors;
    }

    public static void iterate(ArrayList<String> colors){
        for (String color : colors) System.out.println(color);
        System.out.println();
    }

    public static void insert(ArrayList<String> colors, String newColor) {
        colors.add(newColor);
        System.out.println(newColor + " has been added to the list");
        iterate(colors);
    }

    public static void fetch(ArrayList<String> colors, int position) {
        System.out.println(colors.get(position) + " was found at position " + position + "\n");
    }

    public static void update(ArrayList<String> colors, String element, String newElement) {
        for(int i = 0; i < colors.size(); i++){
            if(colors.get(i).equals(element))
                colors.set(i, newElement);
        }
        System.out.println(element + " has been replaced with " + newElement);
        iterate(colors);
    }

    public static void remove(ArrayList<String> colors, int position){
        System.out.println("The element " + colors.get(position) + " at position " + position + " will be removed");
        colors.remove(position);
        iterate(colors);
    }

    public static void search(ArrayList<String> colors, String element){
        System.out.println("The element " + element + " has been found at positions:");
        for(int i = 0; i < colors.size(); i++){
            if(colors.get(i).equals(element))
                System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(ArrayList<String> colors){
        String temp;
        for(int i = 1; i < colors.size(); i++) {
            int j = i;
            while(j > 0 && colors.get(i).compareTo(colors.get(j - 1)) < 0) {
                temp = colors.get(j);
                colors.set(j, colors.get(j - 1));
                colors.set(j - 1, temp);
                j--;
            }
        }
        System.out.println("List has been sorted");
        iterate(colors);
    }

    public static ArrayList<String> copy(ArrayList<String> colors){
        ArrayList<String> newList = new ArrayList<>(colors);
        System.out.println("New list has been copied");
        return newList;
    }

    public static void shuffle(ArrayList<String> colors){
        Collections.shuffle(colors);
        System.out.println("List has been shuffled");
        iterate(colors);
    }

    public static void reverse(ArrayList<String> colors){
        ArrayList<String> newList = new ArrayList<>();
        for(int i = colors.size() - 1; i >= 0; i--)
            newList.add(colors.get(i));
        colors = newList;
        System.out.println("List has been reversed");
        iterate(colors);
    }

    public static ArrayList<String> extract(ArrayList<String> colors, int i1, int i2){
        ArrayList<String> newList = new ArrayList<>();
        for(int i = i1; i <= i2; i++)
            newList.add(colors.get(i));
        System.out.println("Subset of the list between positions " + i1 + " and " + i2 + " has been retrieved");
        return newList;
    }

    public static void swap(ArrayList<String> colors, int i1, int i2){
        Collections.swap(colors, i1, i2);
        System.out.println("The elements at positions " + i1 + " and " + i2 + " have been swapped");
        iterate(colors);
    }
}
