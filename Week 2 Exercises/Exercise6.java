//package com.Week2.Day7.Assignment2;
//
///**
// * Program to validate student record
// */
//
//public class trainee {
//    private trainee(){
//
//    }
//    private static trainee;
//
//    public static synchronized trainee getInstance() {
//        if (instance == null) {
//            return instance = new trainee();
//        }
//        else {
//            return instance;
//        }
//    }
//}
//


import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numOfStudents = input.nextInt();
        System.out.print("Enter a student name:");
        String student1 = input.next();
        System.out.println("Enter a student score:");
        double score1 = input.nextDouble();
        for (int i = 0; i < numOfStudents-1; i++) {
            System.out.print("Enter a student name:");
            String student = input.next();
            System.out.println("Enter a student score:");
            double score = input.nextDouble();
            if(score > score1) {
                student1 = student;
                score1 = score;
            }
            System.out.println((new StringBuilder("Top student")).append("'s score is ").append(score1).toString());; ;

        }

    }
}
