package com.alec.day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> mList = new ArrayList<String>();

        mList.add("Mark");
        mList.add("Paul");
        mList.add("Watson");

        //System.out.println(mList);

        // iterator
        Iterator iterator = mList.iterator();
        // hasNext() will check if iterator has the element
        while (iterator.hasNext()){
            System.out.println(iterator.next());  // print the element and move the cursor to the next
        }

        // foreach
        for(String name: mList){
            System.out.println(name);
        }
    }
}
