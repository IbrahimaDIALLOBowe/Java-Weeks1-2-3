package Week3.Day9.Assignements3;

/**
 * Write a Java program to iterate through all elements in a linked list.
 */

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        for (String string : list) {
            System.out.println(string);
        }
        list.forEach(System.out::println);


    }

}
