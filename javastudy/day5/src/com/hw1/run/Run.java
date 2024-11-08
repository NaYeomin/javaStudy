package com.hw1.run;
import com.hw1.model.vo.Student;
import com.hw1.model.vo.Employee;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]=new Student("홍길동",20,178.2,70,1,"정보통신공학과");
        students[1]=new Student("김말똥",21,187.3,80,2,"경영학과");
        students[2]=new Student("강동원",23,167,45,4,"정보통신공학과");
        
        for(int i=0;i<students.length;i++){
            
            System.out.println(students[i].toString());

        }


        Scanner scn=new Scanner(System.in);


        Employee employees[]=new Employee[3];

        for(int i=0;i<employees.length;i++){

            String name;
            int age;
            double height,weight;
            int salary;
            String dept;
            
            //employees[0]=new Employee();

        }



    }

}
