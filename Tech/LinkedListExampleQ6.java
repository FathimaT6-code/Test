package com.learnig.practice;

//import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExampleQ6 {

        //private ArrayList<Integer> evenlist = new ArrayList<Integer>();

        private LinkedList<Integer> evenList = new LinkedList<>();

        public LinkedList<Integer> saveEvenNumbers(int n){
            evenList = new LinkedList<>();
            for(int i=0; i<=n; i++){
                if(i%2==0)
                    evenList.add(i);
            }
            return evenList;
        }

        public LinkedList<Integer> printEvenNumbers(int n){
            LinkedList<Integer> printlist = new LinkedList<>();
            System.out.print("New list: ");
            for (int item: evenList){
                printlist.add(item*2);
                System.out.print(item*2+"\t");
                //System.out.print("\t");
            }
            return printlist;
        }

        public static void main(String args[]){
            //com.learnig.practice.ArrayListExample al = new com.learnig.practice.ArrayListExample();

            LinkedListExampleQ6 li = new LinkedListExampleQ6();
            li.saveEvenNumbers(10);
            li.printEvenNumbers(10);
        }
    }


