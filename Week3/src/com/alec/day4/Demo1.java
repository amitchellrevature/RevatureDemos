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
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // foreach
        for(String name: mList){
            System.out.println(name);
        }
    }
}
