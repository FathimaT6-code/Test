package com.learnig.practice;

public class CharCheckQ5 {
    public static void main(String args[]){
        char ch1='*';
        if(Character.isAlphabetic(ch1)){
            System.out.println(ch1+" is Alphabet");
        }
       else if(Character.isDigit(ch1))
        {
            System.out.println(ch1+" is Digit");
        }
       else {
            System.out.println(ch1+" is Special character");
        }
    }
}
