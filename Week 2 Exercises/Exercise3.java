package com.Week2.Day7.Assignment2;


public class Exercise3 {
    public static void main(String[] args) throws ArithmeticException {



        divide();

    }
    static void divide() throws ArithmeticException
    {
        int a = 12;
        int b = 5;

        if(b==5)  {
            throw new ArithmeticException("cannot divide by 5");
        }
        else {
            int res = a/b;
            System.out.println(res);
        }
    }
}
