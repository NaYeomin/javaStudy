package com.hw1.model.vo;

public class Person {
    protected String name;
    int age;
    double height;
    double weight;

    Person(){}

    public Person(int age,double height,double weight){
        
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public String toString(){
        return ("name: "+name+", age: "+age+", height: "+height+", weight: "+weight);

    }


}
