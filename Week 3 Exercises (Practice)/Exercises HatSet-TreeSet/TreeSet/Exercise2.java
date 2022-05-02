package Week3.Assignements3.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Exercise 2: Write a Java program to iterate through all elements in a tree set.
 */

public class Exercise2 {
    public static void main(String[] args) {
        // create an empty Tree set
        TreeSet<String> tree_set = new TreeSet<String>();

        // add element to the empty tree set
        tree_set.add("Pink");
        tree_set.add("Yellow");
        tree_set.add("Move");
        tree_set.add("Gold");


        // set Iterator
        Iterator<String> c = tree_set.iterator();

        // Iterate the tree set
        while (c.hasNext()) {
            System.out.println(c.next());
        }
    }
}



