package day3;

public class StudentMain1 {
    public static void main(String[] args) {
        Student john=new Student("John","20233307");
        Student lee=new Student("Lee","20233305");
        Student July=new Student("July","20213302");

        john.age=18;
        lee.age=20;
        July.age=19;

        // System.out.println("나이:"+john.age+" 이름: "+john.name+" 학번: "+john.id);
        // System.out.println("나이:"+lee.age+" 이름: "+lee.name+" 학번: "+lee.id);
        // System.out.println("나이:"+July.age+" 이름: "+July.name+" 학번: "+July.id);


        Student students[]={john,lee,July};

        for(Student s:students){
            s.showInfo();
        }


    }
    



}
