package Week3.Day12.Exercises;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/**
 * Exercise 2: Write a Java program to get specific files by extensions from a specified folder.
 */
public class Exercise2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\idial\\code\\Rev Java\\Projects\\Java Week1,2,3\\Java-Weeks1-2-3\\Week 3 Exercises (Practice)");
        File[] fl = file.listFiles((d,f)-> f.toLowerCase(Locale.ROOT).endsWith("txt"));

        for(File f : fl) {
            System.out.println(f.getName());
        }

    }

}
