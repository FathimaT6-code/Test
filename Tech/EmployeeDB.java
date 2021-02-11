package com.learnig.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
    /*add employee method
    * delete employee
    * show payslip
    * listAll */
    List<Employee> employeeDb = new ArrayList<>();
    public boolean addEmployee(Employee e){
    return employeeDb.add(e);
    }

    public boolean deleteEmployee(int empID){
      boolean isDeleted=false;
        Iterator<Employee> employeeIterator = employeeDb.iterator();

        while(employeeIterator.hasNext()){
            Employee emp = employeeIterator.next();
            if(emp.getEmpID()==empID){
                employeeIterator.remove();
                isDeleted=true;
            }

        }
        return isDeleted;
    }

    public String showPaySlip(int empID){
        String salaryDetails="";
        for(Employee emp: employeeDb){
            if(emp.getEmpID()==empID){
                salaryDetails= "salary is: " + emp.getEmpSalary();
            }
        }
        return salaryDetails;
    }

    public Employee[] listAll()
    {
        Employee[] employeeArray = new Employee[employeeDb.size()];
        for(int i=0; i<employeeDb.size(); i++){
        employeeArray[i]=employeeDb.get(i);
        }
        return employeeArray;
    }
}
