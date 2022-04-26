package com.Week1.Day2.Exercises;

/**
 * exercise 10: Write a program in Java to display the pattern like a diamond.
 */

public class Exercise10 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) // raw
        {
            for (j = 5; j > i; j--) // space (column)
            {
                System.out.print(" ");

            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (i = 5; i >= 1; i--) // raw
        {
            for (j = 5; j > i; j--) // space (column)
            {
                System.out.print(" ");

            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");

            //NEED TO HELP TO MAKE IT 7

        }

    }
}