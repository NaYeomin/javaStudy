package day4.ex.access;

public class MaxCounter {
    private int count;
    private int max;

    MaxCounter(int max){
        this.count=0;
        this.max=max;
    }

    public void increment(){
        
        
        if(count>=max){
            System.out.println("최대값을 초과할 수 없습니다.");
            count=max;
        }
        else{
            this.count++;
        }
        


    }

    public int getCount(){
        return count;

    }

}
