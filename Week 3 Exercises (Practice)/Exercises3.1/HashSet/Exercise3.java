package Week3.Assignements3.HashSet;

import java.util.HashSet;

/**
 * Exercise 3: Write a Java program to get the number of elements in a hash set.
 */

public class Exercise3 {
    public static void main(String[] args) {
        // create an empty hash set list
        HashSet<String> C_set = new HashSet<String>();

        // use add() method to add values in the hash set
        C_set.add("Paul");
        C_set.add("John");
        C_set.add("Nacer");
        C_set.add("Ibrahima");
        System.out.println("Original Hash Set: "+C_set);
        System.out.println("Size of Hash Set: "+ C_set.size());

    }
}
