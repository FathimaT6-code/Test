package com.learnig.practice;

public class Employee {
    /*variable declarations
    constructors
    methods
    getter and setters*/
    
    int EmpID;
    String EmpName;
    String EmpEmail;
    char EmpGender;
    float EmpSalary;
    
    public Employee(){
        
            }
    public Employee(int empID, String empName, String empEmail, char empGender, float empSalary){
        super();
    EmpID=empID;
    EmpName=empName;
    EmpEmail=empEmail;
    EmpGender=empGender;
    EmpSalary=empSalary;
    }
    public String GetemployeeDetails(){
        return "Employee [EmpID=" +EmpID+", EmployeeName= " + EmpName + ", Employee Email = " + EmpEmail+
                ", Employee Gender= " + EmpGender + ", Employee Salary = " + EmpSalary+ "]";
    }

    public int getEmpID(){
        return EmpID;
    }
    public void setEmpID(int empID){
        EmpID=empID;
    }
    public String getEmpName(){
        return EmpEmail;
    }
    public void setEmpName(String empName){
       EmpName=empName;
    }
    public String getEmpEmail(){
        return EmpEmail;
    }
    public void setEmpEmail(String empEmail){
      EmpEmail=empEmail;
    }

    public char getEmpGender(){
        return EmpGender;
    }
    public void setEmpGender(char empGender){
       EmpGender=empGender;
    }
    public float getEmpSalary(){
        return EmpSalary;
    }
    public void setEmpSalary(float empSalary){
        EmpSalary=empSalary;
    }
}
