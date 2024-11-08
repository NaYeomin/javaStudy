package com.hw1.model.vo;

public class Student extends Person{
    int grade;
    String major;

    public Student(){}

    public Student(String name,int age,double height,double weight,int grade,String major){
        
        super(age,height,weight);
        this.grade=grade;
        this.major=major;

    }

    String toString(){
        super.toString();
        return ("grade: "+grade+"major: "+major);

    }

}
