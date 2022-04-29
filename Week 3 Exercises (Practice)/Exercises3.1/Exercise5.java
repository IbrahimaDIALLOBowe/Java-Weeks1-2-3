package Week3.Day12.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Exercise 5: Write Java program to read input from java console.
 */
public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("C:\\Users\\idial\\code\\Rev Java\\Projects\\Java Week1,2,3\\Java-Weeks1-2-3\\Week 3 Exercises (Practice)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mydata = "default data";
        try{
            System.out.println("Please entre a string of data");
            mydata = br.readLine();

        } catch (IOException ioe) {

        }
        System.out.println(mydata);

    }
}
