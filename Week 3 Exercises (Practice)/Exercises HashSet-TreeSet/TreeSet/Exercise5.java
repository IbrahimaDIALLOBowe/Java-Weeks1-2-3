package Week3.Assignements3.TreeSet;

import java.util.TreeSet;

/**
 * Exercise 5: Write a Java program to get the first and last elements in a tree set
 */

public class Exercise5 {
    public static void main(String[] args) {
        // create an empty Tree set list
        TreeSet<String> tree_set = new TreeSet<String>();

        // add elements
        tree_set.add("BMW");
        tree_set.add("Honda");
        tree_set.add("Renault");
        tree_set.add("Benz");
        System.out.println(tree_set);

        // find the first element of the tree_set
        Object first_element = tree_set.first();
        System.out.println("first element is: "+first_element);

        // find the first element of the tree set
        Object last_element = tree_set.last();
        System.out.println("last element is: "+last_element);

    }
}
