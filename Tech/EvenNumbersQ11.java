package com.learnig.practice;
import java.util.*;
public class EvenNumbersQ11 {
    public static void main(String args[]){
        int numbers[]={23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57};
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i]);
            }
            /*else{
                System.out.println("Invalid");
            }*/
        }
    }
}
