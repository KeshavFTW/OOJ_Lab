class Thread1 implements Runnable {
    Thread t;
    Thread1(){
        t = new Thread(this,"DemoThread1");
        System.out.println("Child Thread1 :"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=1;i<=3;i++){
                System.out.println("Child Thread1 :BMS College of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
        finally{
            System.out.println("Exiting Child1 Thread");
        }
    }
}

class Thread2 extends Thread{
    Thread2(){
        super("Thread2");
        System.out.println("Child Thread2 :"+this);
        start();
    }
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Child Thread2 :CSE");
                sleep(2000);
            }
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
        finally{
            System.out.println("Exiting Child2 Thread");
        }
    }
}

public class Threadsuse {
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        try{
            for(int i=1;i<=18;i++){
                System.out.println("Main Thread :"+i);
                Thread.sleep(2500);
            }
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
        finally{
            System.out.println("Exiting Main Thread");
        }
    }
}
