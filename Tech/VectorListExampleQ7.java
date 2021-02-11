package com.learnig.practice;

//import java.util.LinkedList;
import java.util.Vector;

public class VectorListExampleQ7 {

        //private ArrayList<Integer> evenlist = new ArrayList<Integer>();

        public Vector<Integer> evenList = new Vector<>();

        public Vector<Integer> saveEvenNumbers(int n){
            evenList = new Vector<>();
            for(int i=0; i<=n; i++){
                if(i%2==0)
                    evenList.add(i);
            }
            return evenList;
        }

        public Vector<Integer> printEvenNumbers(int n){
            Vector<Integer> printlist = new Vector<>();
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

            //com.learnig.practice.LinkedListExampleQ6 li = new com.learnig.practice.LinkedListExampleQ6();

            VectorListExampleQ7 vl = new VectorListExampleQ7();
            vl.saveEvenNumbers(15);
            vl.printEvenNumbers(15);
        }
    }
