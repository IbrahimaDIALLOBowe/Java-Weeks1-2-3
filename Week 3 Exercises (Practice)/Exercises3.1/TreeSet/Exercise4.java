package Week3.Assignements3.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Exercise 4: Write a Java program to create a reverse order view of the elements contained in a given tree set.
 */

public class Exercise4 {
    public static void main(String[] args) {
        // create empty list for tree_set1
        TreeSet<String> t1_set1 = new TreeSet<String>();

        // add() method to add values in the tree set
        t1_set1.add("Paul");
        t1_set1.add("John");
        t1_set1.add("Nacer");
        t1_set1.add("Ibrahima");

        //print original list
        System.out.println("Original tree_set1: "+t1_set1);
        Iterator all = t1_set1.descendingIterator();

        // print list elements in reverse order
        System.out.println("Element in reverse Order: ");
        while (all.hasNext()) {
            System.out.println(all.next());
        }
    }

}
