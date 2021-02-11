package com.learnig.practice;

import java.util.Scanner;

public class ReverseQ17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int  rem = num % 10;
            sum=(sum*10)+rem;
            num = num / 10;

        }

        System.out.print("output: "+sum);
    }
    }
