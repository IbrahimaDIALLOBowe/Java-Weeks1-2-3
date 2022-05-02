package Week3.Assignements3.HashSet;


import java.util.HashSet;

/**
 * Exercise 1: Write a Java program to append the specified element to the end of a linked list.
 */


public class Exercise1 {
    public static void main(String[] args) {
        // create an empty hash set
        HashSet<String> C_set = new HashSet<>();

        // used add() method to add values in the hash set
        C_set.add("Banana");
        C_set.add("Tomato");
        C_set.add("Mangoes");
        C_set.add("Eggs");

        // print the hash set
        System.out.println("The Hash Set: "+C_set);


    }
}
