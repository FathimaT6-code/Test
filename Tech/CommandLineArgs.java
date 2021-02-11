package com.learnig.practice;

import java.util.Scanner;

public class CommandLineArgs {
    public static void main(String[] args){
    int count;
    Scanner input=new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    count=input.nextInt();
    String[] Values=new String[count];

    for(int i=0; i<count; i++){
        System.out.println("Enter values:");
        Values[i]=input.next();
            }
    input.close();
        System.out.println("Output is");
        for(int i=0; i<count; i++) {
            System.out.println(Values[i]);
            if(Values[i]==null){
                System.out.println("No Values");
            }
        }

    }
}
        /*String[] st1 = new String[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Input");
        String str =s.nextLine();
        System.out.println("output:"+str);
        for(int i=0; i<5; i++){
            System.out.println("output:"+st1);
        }
        if(str.length()==0){
            System.out.println("No values");
        }*/






