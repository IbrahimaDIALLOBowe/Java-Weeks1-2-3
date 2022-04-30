package Week3.Day12.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Exercise 7: Write a Java program to read first 3 lines from a file
 */
public class Exercise7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Week3/Day12/Exercises/ForExercise6.txt");
        Scanner sc = new Scanner(file);


        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());



    }
}
