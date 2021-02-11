package com.learnig.practice;

import java.util.Scanner;

public class FloydsQ16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows= sc.nextInt();
        int counter, j;
        for(counter=1; counter<=rows; counter++){
            for(j=1; j<=counter; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
