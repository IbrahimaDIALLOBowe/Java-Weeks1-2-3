package com.Week1.Day2.Exercises;

import java.util.Scanner;

/**
 * exercise 7: Write a program in Java to display the multiplication table of a given integer.
 */
public class Exercise7 {
    public static void main(String[] args) {
        int number,multiplier;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        number = input.nextInt();
        input.close();

        for( multiplier = 1; multiplier <=5; multiplier++) {
            System.out.printf("%d * %d = %d\n", number, multiplier, (number * multiplier));
        }


    }
}
