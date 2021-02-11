package com.learnig.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListofNumbers {
    public static void main(String args[]) {
        List<Number> numbers = new ArrayList<Number>();
        numbers.add(1);
        numbers.add(2.5);
        numbers.add(2000.589);

        /*for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }*/
        Iterator<Number> it = numbers.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
