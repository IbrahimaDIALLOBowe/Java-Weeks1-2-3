package Week3.Day9.Assignements3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program to append the specified element to the end of a linked list.
 */



public class Exercise1  {
    public static void main(String[] args) {
        List<String> mList = new ArrayList<>();
        mList.add("Java");
        mList.add("Python");
        mList.add("CSS");

        System.out.println(mList);

        // iterator

        System.out.println("********** ");

        Iterator iterator = mList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // for each
        System.out.println("********** ");

        for (String names: mList){
            System.out.println(names);
        }

    }
}
