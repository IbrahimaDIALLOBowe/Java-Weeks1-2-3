package com.Week1.Day2.Exercises;

/**
 * exercise 8: Write a program in Java to display the pattern like right angle triangle with a number.
 */

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row;
        System.out.println("Enter size of triangle:");
        row = sc.nextInt();

        for(int i =1;i<=row;i++) {
            for(int j = 1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
