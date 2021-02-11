package com.learnig.practice;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= reader.nextInt();

        if (num < 0) {
            System.out.println(num+ " is negative");
        } else if (num>0) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is Zero");
        }

    }
}
