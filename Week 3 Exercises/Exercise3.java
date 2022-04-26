package Week3.Day9.Assignements3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *  Write a Java program to iterate through all elements in a linked list starting at the specified position.
 */

public class Exercise3 {
    public static void main(String[] args) {
       LinkedList<String> gList = new LinkedList<String>();
        gList.add("BMW");
        gList.add("Audi");
        gList.add("Auda");

        ListIterator<String> iter = gList.listIterator();

        if (iter.hasNext()){
            iter.next();
            iter.add("bike");

        }
        for (String item: gList){
            System.out.println(item+" ");
        }





//        System.out.println(gList.getFirst());
//        System.out.println(gList.getLast);
    }

}
