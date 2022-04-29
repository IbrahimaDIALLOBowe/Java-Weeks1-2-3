package Week3.Day12.Exercises;

import java.util.Scanner;

/**
 * Exercise 8: Write a Java program to find the longest word in a text file.
 * */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
//        String a = sc.next();
//        a = a.trim();
//        a = a+ " ";
        char[] a = (sc.nextLine()+" ").toCharArray();
        int l = a.length;
        int ll = 0; // to store the length of the longest word
        String b = ""; // to store the words temporarily
        String f = ""; // to store the longest word
        for(int i = 0;i<l;i++)
        {
//            int i = 0;
            char c = a[i];
            if(c!=' ')
                b = b+c;
            else {
                int lt = b.length(); //to store  the length of each word temporarily
                if (lt > ll) {
                    f = b;
                    ll = lt - 1;
                }
                b = " ";}

            }
        System.out.println("Longest word : "+f+" with length : "+ll);
        }

    }

