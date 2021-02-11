package com.learnig.practice;

import java.util.Iterator;
import java.util.Vector;

class Employee2 {
        private int id;
        private String name;
        private Double salary;

        public Employee2(int id, String name, Double salary){
            super();
            this.id=id;
            this.name=name;
            this.salary=salary;
        }

        public int getId(){
            return id;
        }

        public String toString(){
            return "Employee details are employee Id: "+id+", employee name:" +name+ ", employee salary: "+salary;
        }
    }
public class VectorListEmployee {
    public static void main(String args[]){
        Vector<Employee2> e =new Vector<>();
        e.add(new Employee2(1000, "John", 20000.8));
        e.add(new Employee2(1001, "Sheldon", 25000.99));
        e.add(new Employee2(1002, "Raj", 30000.5));

        Iterator<Employee2> it = e.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
