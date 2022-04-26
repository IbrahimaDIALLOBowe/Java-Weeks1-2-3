package com.Week1.Day2.Exercises;

/**
 * exercise 9: Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
 */
public class Exercise9 {
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=4;i++) {

            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
                System.out.print(i+" ");
            System.out.println();
        }

    }
}
