package com.learnig.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEmployee {
    public static class Employee1 {
    int id;
    String name;
    Double salary;

    public Employee1(int id, String name, Double salary){
        super();
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getID(){
        return id;
    }
        public String GetemployeeDetails(){
            return "Employee details are EmpID=" +id+", EmployeeName= " + name + ", Employee Salary = " + salary;
        }
    }

    public static void main(String args[]){
        List<Employee1> emp = new ArrayList<>();
        emp.add(new Employee1(1000, "John", (double) 20000));
        emp.add(new Employee1(1001, "Sheldon", (double) 25000));
        emp.add(new Employee1(1002, "Raj", (double) 30000));

        Iterator<Employee1> it = emp.iterator();
        int id=1000;
        while(it.hasNext()) {
            Employee1 employee1 = it.next();
            if(employee1.getID()==id)
                System.out.println(employee1.GetemployeeDetails());
        }

    }
}
