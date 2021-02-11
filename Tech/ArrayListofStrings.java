package com.learnig.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListofStrings {
    public static void printAll(List<String> names){
        Iterator<String> it = names.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
    public static void main(String args[]){
        List<String> names= new ArrayList<String>();
        names.add("James");
        names.add("John");
        names.add("Steve");
        names.add("Mark");
        names.add("Amy");
        printAll(names);
    }
}

/*
    List<String> names = new ArrayList<String>();

    public ArrayList<String> printAll() {
        names.add("James");
        names.add("John");
        names.add("Steve");
        names.add("Mark");
        names.add("Amy");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        return (ArrayList<String>) names;

    }

    public static void main(String args[]) {
        ArrayListofStrings als = new ArrayListofStrings();
        als.printAll();
    }
}*/
