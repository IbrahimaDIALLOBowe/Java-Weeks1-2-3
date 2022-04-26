package com.Week2.Day7.Assignment2;

/**
 * Program with try and catch & finally block
 */

public class Exercise1 {
    public static void main(String[] args) {
        try {
            int i=7;
            int j =0 ;
            int k =i/j ;
            System.out.println("output is " + k);
        }
        catch (ArithmeticException e) {
            System.out.println("Error ");

        }
        finally {
            System.out.println("Loading");
        }

    }
}
