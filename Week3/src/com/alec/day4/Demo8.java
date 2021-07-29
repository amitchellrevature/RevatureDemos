package com.alec.day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo8 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");
        System.out.println(names);

        // adding element at specified position
        names.add(0, "John");
        System.out.println(names);

        // adding second list
        LinkedList<String> namesNew = new LinkedList<>();
        namesNew.add("Stacy");
        namesNew.add("Smith");

        //names.addAll(namesNew);
        //System.out.println(names);

        names.addAll(0, namesNew);
        System.out.println(names);

        // addFirst()
        names.addFirst("First");
        System.out.println(names);


        // addLast()
        names.addLast("Last");
        System.out.println(names);

        // remove()
        // remoteFirst()
        // removeLast()
        // removeFirstOccurrence()
        // removeLastOccurrence()

        names.add("John");
        names.add("Paul");
        System.out.println(names);

        //names.removeFirstOccurrence("John");
        names.removeLastOccurrence("John");
        System.out.println(names);

        // reverse elements
        System.out.println("original");
        System.out.println(names);

        // traversing list element in reverse order
        Iterator iterator = names.descendingIterator();
        while(iterator.hasNext()){
            //SSystem.out.println(iterator.next());
        }

        for(int i=names.size() -1; i>0;i--){
            //System.out.println(names.get(i));
        }

    }
}
