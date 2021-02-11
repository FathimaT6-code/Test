package com.learnig.practice;

import java.util.Scanner;

public class MenuQ20 {
    public static int getSum(int number1, int number2) {
        int sum;
        sum=number1+number2;
        return  sum;
    }
    public static int getdiff(int number1, int number2) {
        int diff;
        diff=number1-number2;
        return  diff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose from below two options:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        int option = sc.nextInt();
        System.out.println("option is:" + option);
        System.out.println("Please enter two numbers:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("entered numbers are: "+ num1+","+num2);
        if (option==1){
            System.out.println("Result is: "+ getSum(num1,num2));
        }
        else {
            System.out.println("Result is: "+ getdiff(num1,num2));
        }
    }
}
