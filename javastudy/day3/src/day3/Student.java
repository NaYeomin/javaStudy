package day3;

public class Student {
    public int age;
    public String name;
    public String id;

    public Student(){}

    public Student(String name,String id){
        this.name=name;
        this.id=id;
    }

    public void showInfo(){
        System.out.println("나이:"+age+" 이름: "+name+" 학번: "+id);
    }

    void studentInit(int age,String name,String id){
        this.age=age;
        this.name=name;
        this.id=id;
    }


}
