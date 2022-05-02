package Week3.Assignements3.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Exercise 2: Write a Java program to iterate through all elements in a hash list.
 */
public class Exercise2 {
    public static void main(String[] args) {
        // create a empty hash set list
        HashSet<String> C_set = new HashSet<>();

        // use add() method to add values in the hash set
        C_set.add("BMW");
        C_set.add("Honda");
        C_set.add("Renault");
        C_set.add("Benz");

        // set Iterator
        Iterator<String> c = C_set.iterator();

        // call Iterate hash set while
        while (c.hasNext()){
            System.out.println(c.next());
        }

    }
}
