package quz;

public class ClassTestSynchronized {
	public static void main(String[] args) {
        Car c=new Car();
        c.print();
        MyThread t1=new MyThread(c,1);
        t1.start();
         
        MyThread t2 = new MyThread(c,-1);
        t2.start();
         
         
        try{
            t1.join();
            t2.join();
//          Thread.sleep(1000);
        }catch(Exception e){System.out.println("error");}
         
        c.print();
    }
 
}
class Car{
    private int speed;
    public Car(int a){speed=a;}
    public Car(){speed=0;}
    synchronized  public void add(int a){speed=speed+a;}
    public void print(){System.out.println("speed:"+speed);}
     
}
 
class MyThread extends Thread {
    private Car c;
    int stepChange;
    public MyThread(Car c, int s){
        super();
        this.c=c;
        stepChange=s;
    }
    public void run(){
        for(int i=0;i<10000;i++)c.add(stepChange);
         
    }
}
 
 
public class ClassTestSynchronized {
 
    public static void main(String[] args) {
        Car c=new Car();
        c.print();
        MyThread t1=new MyThread(c,1);
        t1.start();
         
        MyThread t2 = new MyThread(c,-1);
        t2.start();
         
         
        try{
            t1.join();
            t2.join();
//          Thread.sleep(1000);
        }catch(Exception e){System.out.println("error");}
         
        c.print();
    }
 
}




