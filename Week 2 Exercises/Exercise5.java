package com.Week2.Day7.Assignment2;



/**
 * Program to create custom exception
 */


public class Exercise5 {
    public static void main(String[] args) {
        int i,j;
        i = 8;
        j = 9;

        try {
            int k = i/j;
            if(k==0)
                throw new IsthatException(" this isn't possible");
            System.out.println(k);
        }
        catch (IsthatException e) {
            System.out.println("Error" + e.getMessage());

        }





    }
}
