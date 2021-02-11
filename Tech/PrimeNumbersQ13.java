package com.learnig.practice;

public class PrimeNumbersQ13 {

    public static void main(String args[]){
        int minValue=10;
        int maxValue=99;
        while(minValue<=maxValue){
            boolean isPrime=true;
            for(int i=2; i<=minValue/2; i++){
                if((minValue%i)==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(minValue+" ");
            }
            minValue++;
        }
    }
}