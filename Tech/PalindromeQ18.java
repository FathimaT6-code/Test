package com.learnig.practice;

import java.util.Scanner;

public class PalindromeQ18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        int temp=num;
        //int rem = 0;
        while (num > 0) {
            int  rem = num % 10;
            sum=(sum*10)+rem;
            num = num / 10;

        }
        if(temp==sum){
            System.out.print("palindrome");}
        else{
            System.out.print("not palindrome");
        }

    }
}
