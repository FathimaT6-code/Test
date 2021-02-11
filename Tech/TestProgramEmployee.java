package com.learnig.practice;
import com.learnig.practice.Employee;
import com.learnig.practice.EmployeeDB;

public class TestProgramEmployee {
    public static void main(String args[]){
        EmployeeDB employeeDB = new EmployeeDB();
        Employee employee1 = new Employee(2005,"John","john.a@tech.com",'M',50000);
        Employee employee2 = new Employee(2006, "Amy", "amy.f@tech.com",'F',55000);
        Employee employee3 = new Employee(2007, "Sheldon", "Sheldon.c@tech.com", 'M', 100000);

        employeeDB.addEmployee(employee1);
        employeeDB.addEmployee(employee2);
        employeeDB.addEmployee(employee3);

        for(Employee emp: employeeDB.listAll()){
            System.out.println(emp.GetemployeeDetails());
        }

        System.out.println("Deleting employee..."+employee2.getEmpName()+" "+employeeDB.deleteEmployee(2006));
        //employeeDB.deleteEmployee(2006);
        System.out.println("***********Updated employee info************");
        for(Employee emp: employeeDB.listAll())
            System.out.println(emp.GetemployeeDetails());

        System.out.println(employeeDB.showPaySlip(2007));


    }
}
