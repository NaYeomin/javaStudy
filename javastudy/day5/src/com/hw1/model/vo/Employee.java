package com.hw1.model.vo;

public class Employee extends Person{
    int salary;
    String dept;

    Employee(){}

    public Employee(String name,int age,double height,double weight ,int salary,String dept){
        //name?
        super(age,height,weight);
        this.salary=salary;
        this.dept=dept;

    }

    String toString(){
        //pass;
        super.toString();
        return ("급여: "+salary+", 학과: "+dept);

    }
}
