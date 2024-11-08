package day3;

public class StudentMain2 {
    public static void main(String[] args) {
        Student john=new Student();

        john.studentInit(20,"john","20233307");
        Student lee=new Student();
        lee.studentInit(21,"lee","20233308");
        Student July=new Student();
        July.studentInit(18,"July","20233309");
       
        john.showInfo();
        lee.showInfo();
        July.showInfo();



    }

    

}
