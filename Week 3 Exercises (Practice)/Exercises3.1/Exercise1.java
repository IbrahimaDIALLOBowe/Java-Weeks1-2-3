package Week3.Day12.Exercises;

/**
 * Exercise 1:Write a Java program to get a list of all file/directory names from the given.
 */

import java.io.File;

public class Exercise1 {
    public static void main(String[] args) {
        File dr = new File("C:\\Users\\idial\\code\\Rev Java\\Projects\\Java Week1,2,3\\Java-Weeks1-2-3\\Week 3 Exercises (Practice)");
        File[] lstFiles = dr.listFiles();
        for (int i=0; i< lstFiles.length;i++) {
            if (lstFiles[i].isFile()) {

                System.out.println("File: " + lstFiles[i].getName());}
            else if (lstFiles[i].isDirectory()) {
                System.out.println("Directory: " + lstFiles[i].getName());
            }

        }




    }
}
