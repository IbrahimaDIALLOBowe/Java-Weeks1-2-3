package Week3.Day12.Exercises;

import java.io.File;

/**
 * Exercise 3: Write a Java program to check if a file or directory specified by pathname exists or not.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String fname = "C:\\Users\\idial\\code\\Rev Java\\Projects\\Java Week1,2,3\\Java-Weeks1-2-3\\Week 3 Exercises (Practice)";
        File f = new File(fname);
        if(f.exists()) {
            System.out.println("File exists!");
        }
        else {
            System.out.println("File does not exists!");

        }


    }
}
