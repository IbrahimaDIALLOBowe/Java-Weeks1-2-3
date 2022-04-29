package Week3.Day12.Exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exercise 6: Write a Java program to read a file content line by line.
 */
class ReadLines{

    public static void readLines(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
    }

}

public class Exercise6 {
    public static void main(String[] args) {
        File f = new File("src/Week3/Day12/Exercises/ForExercise6.txt");
        try {
            ReadLines.readLines(f);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
