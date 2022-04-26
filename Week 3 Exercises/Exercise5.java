package Week3.Day9.Assignements3;

/**
 * 5. Write a Java program to insert the specified element at the specified position in the linked list.
 */

import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Connor");
        names.add("Ibrahima");
        names.add("Lisa");

        System.out.println(names);

        // get()
        System.out.println(names.get(1)); // index 1 will be Ibrahima

        // set()
        names.set(1, "Ibrahima Diallo"); // here we have set the index 1 to "Ibrahima Diallo"

        System.out.println(names);

        // forEach to print out each item of the Array
        for (String name : names) {
            System.out.println(name);


        }


    }
}
