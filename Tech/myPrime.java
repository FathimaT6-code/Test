package com.learnig.practice;

import java.util.Scanner;

public class myPrime {
    static boolean checkPrime(int n) {
        boolean isPrime = true;
        if (n == 0 || n == 1) {
            isPrime = false;
            return isPrime;
        } else if (n == 2 || n == 3) {
            isPrime = true;
            return isPrime;
        } else {
            for (int i = 2; i < n / 2; i++) {
                if ((n % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isPrime=checkPrime(num);
        if(isPrime){
            System.out.println(num+ " is a prime number");
        }
        else {
            System.out.println(num+ " is not a prime number");
        }
        sc.close();
    }
}
