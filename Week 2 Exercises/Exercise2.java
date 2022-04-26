package com.Week2.Day7.Assignment2;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            int a[] = null;
            a[6] = 8;
            int i=7;
            int j =0 ;
            int k =i/j ;
            System.out.println("output is " + k);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit... ");
        }
        catch (Exception e) {
            System.out.println("something is not normal with this Exception");
        }
//        finally {
//            System.out.println("Loading");
//        }

    }
    }

