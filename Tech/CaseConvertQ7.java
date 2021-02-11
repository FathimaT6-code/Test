package com.learnig.practice;

import java.util.Scanner;

public class CaseConvertQ7 {
    public static void main(String args[]){
        /*char ch1 = 'a';
        System.out.println(ch1+"->"+Character.toUpperCase(ch1));*/
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter a valid character:");
        //String ch=s.nextLine();
        char ch;
        ch = s.next().charAt(0);

        if(Character.isLowerCase(ch)){
            System.out.println("Output: "+ch+"->"+Character.toUpperCase(ch));
        }
        else{
            System.out.println("Output: "+ch+"->"+Character.toLowerCase(ch));
        }
    }
}
