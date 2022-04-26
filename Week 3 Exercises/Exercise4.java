package Week3.Day9.Assignements3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to iterate a linked list in reverse order
 */

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("red");
        colors.add("orange");
        colors.add("pink");

        // reverse sorting or order
        Collections.reverse(colors);
        for(String color: colors){
            System.out.println(color);
        }
        System.out.println();


    }
}
