package Week3.Assignements3.TreeSet;

import java.util.TreeSet;

/**
 * Exercise 1: Write a Java program to create a new tree set, add some colors (string) and print out the tree set
 */

public class Exercise1 {
    public static void main(String[] args) {
        // create an empty Tree set
        TreeSet<String> tree_set = new TreeSet<String>();

        // add element to the empty tree set
        tree_set.add("Pink");
        tree_set.add("Yellow");
        tree_set.add("Move");
        tree_set.add("Gold");

        // print the colors
        System.out.println(tree_set);
    }

}
