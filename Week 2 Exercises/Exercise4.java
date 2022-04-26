package com.Week2.Day7.Assignment2;

public class Exercise4 {
    public static void main(String[] args) {
        try {
             method1();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static void method1() throws Exception{
        try {
            methode2();
        }
        catch (Exception exception) {
            throw new Exception("Exception thrown in method1"+ exception);
        }
    }
    public static void methode2() throws Exception {
        try {
            method3();
        }
        catch (Exception exception) {
            throw new Exception("Exception thrown in method2" + exception);
        }
    }
    public static void method3() throws Exception {
        throw new Exception( " Exception thrown in method3");
    }
}
