package com.learnig.practice;

import java.util.Scanner;

public class SumofDigitsQ15 {

    public static int getSum(int number){
        int sum;
        for(sum=0;number>0; sum += number%10, number=number/10);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("output is: " + getSum(num));
    }
}



/*{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum=0;
        while (num>0){
            int rem = num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.println(sum);


    }
}*/