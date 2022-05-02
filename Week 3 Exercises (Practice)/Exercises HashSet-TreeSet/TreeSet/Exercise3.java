package Week3.Assignements3.TreeSet;

import java.util.TreeSet;

/**
 * Exercise 3:  Write a Java program to add all the elements of a specified tree set to another tree set.
 */
public class Exercise3 {
    public static void main(String[] args) {
        // create empty list for tree_set1
        TreeSet<String> tree_set1 = new TreeSet<String>();

        // add element to tree_set1
        tree_set1.add("Paul");
        tree_set1.add("John");
        tree_set1.add("Nacer");
        tree_set1.add("Ibrahima");
        System.out.println("Tree_set1: "+tree_set1);

        // create empty list for tree_set2
        TreeSet<String> tree_set2 = new TreeSet<String>();

        // add element to tree_set2
        tree_set2.add("BMW");
        tree_set2.add("Honda");
        tree_set2.add("Renault");
        tree_set2.add("Benz");

        System.out.println("Tree_set2: "+tree_set2 );

        // add tree_set2 to tree_set1
        tree_set1.addAll(tree_set2);
        System.out.println("tree set1: " +tree_set1);

    }
}
