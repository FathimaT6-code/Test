package com.learnig.practice;

import java.util.Scanner;

public class InterestQ6 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Gender");
        String gender=s.nextLine();
        System.out.println("Enter Age");
        int age=s.nextInt();
        if (gender.equalsIgnoreCase("female") && (age >= 1 || age<=58)) {
            System.out.println("Interest rate = 8.2%");
        }  else if (gender.equalsIgnoreCase("female")  && (age >= 59 || age <= 120)) {
                System.out.println("Interest rate = 7.6%");
            } else if (gender.equalsIgnoreCase("male") && (age >= 1 || age <= 60)) {
                System.out.println("Interest rate = 9.2%");
            } else if (gender.equalsIgnoreCase("male") && (age >= 61 || age <= 120)) {
                System.out.println("Interest rate = 8.3%");
            } else {
                System.out.println("Please enter valid information");
            }
        }
    }

