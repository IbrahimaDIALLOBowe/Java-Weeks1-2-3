package Week3.Day12.Exercises;

import java.io.File;

/**
 * Exercises 4: Write a Java program to check if given pathname is a directory or a file.
 */

public class Exercise4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\idial\\code\\Rev Java\\Projects\\Java Week1,2,3\\Java-Weeks1-2-3\\Week 3 Exercises (Practice)\\Folder1\\Text4.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println("Getting file path using path method" + file.getPath());

    }
}
