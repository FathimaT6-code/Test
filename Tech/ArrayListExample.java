package com.learnig.practice;

import java.util.ArrayList;

public class ArrayListExample {
    private ArrayList<Integer> evenlist = new ArrayList<Integer>();

    public ArrayList<Integer> saveEvenNumbers(int n){
        evenlist = new ArrayList<Integer>();
        for(int i=0; i<=n; i++){
            if(i%2==0)
                evenlist.add(i);
        }
        return evenlist;
    }

    public ArrayList<Integer> printEvenNumbers(int n){
        ArrayList<Integer> printlist = new ArrayList<Integer>();
        System.out.print("New list: ");
        for (int item: evenlist){
            printlist.add(item*2);
            System.out.print(item*2+"\t");
            //System.out.print("\t");
        }
        return printlist;
    }

    public static void main(String args[]){
        ArrayListExample al = new ArrayListExample();
        al.saveEvenNumbers(10);
        al.printEvenNumbers(10);
    }
}
