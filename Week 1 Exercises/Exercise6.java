package com.Week1.Day2.Exercises;

/** Exercise 6: Take three numbers from the user and print the greatest number
 *
 * Test Data
 * Input the 1st number: 25
 * Input the 2nd number: 78
 * Input the 3rd number: 87
 * Expected Output :
 * The greatest: 87
 */

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
//        Scanner sc = null;
        int x = sc.nextInt();
        System.out.println("enter the second number");
        int y = sc.nextInt();
        System.out.println("enter the third number");
        int z = sc.nextInt();
        if (x>y)
            if (x>z) {
                System.out.println("greatest number:="+x);
            }
        if (y>x)
            if (y>z) {
                System.out.println("greatest value:="+y);
            }
        if (z>x)
            if (z>x)
                System.out.println("greatest number:="+z);
        }
    }

