
package Test;


class Father {
    int age1;
    Father(int age)throws WrongAge{
        if(age<0){
            throw new WrongAge();
        }
        this.age1=age;
    }
}

class Son extends Father{
    int age2;
    Son(int age1, int age2)throws WrongAge{
        super(age1);
        if(age2<0||age1<=age2){
            throw new WrongAge();
        }
        this.age2=age2;
    }
    void getAges(){
        System.out.println("Father's Age :"+super.age1);
        System.out.println("Son's Age :"+this.age2);
    }
}

public class exceptionhandling{
    public static void main(String[] args){
        try{
            Son s1=new Son(10,20);
            s1.getAges();
            
        }
        catch(WrongAge w){
            w.printStackTrace();
        }
    }
}
