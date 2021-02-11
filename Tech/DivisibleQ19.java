package com.learnig.practice;

public class DivisibleQ19 {
    public static void main(String args[]) {
        int num = 0;
        while (num <= 150) {
            if ((num % 2) == 0 && (num % 3) == 0 && (num % 5)== 0)
            {
                System.out.println(num);
            }
            num++;
        }
    }
}
