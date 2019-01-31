class MyThread implements Runnable{
    public void run(){   //overrides Thread's run() method
           for(int i=1;i<=5;i++){
                System.out.println("Hi");
                    try
                       {
                        Thread.sleep(500);
                       }
                    catch(Exception e)
                      {
                      
                       }

                }
    }
}
class MyThread1 implements Runnable{
    public void run(){   //overrides Thread's run() method
           for(int i=1;i<=5;i++){
                System.out.println("Hello");
                    try
                       {
                        Thread.sleep(500);
                       }
                    catch(Exception e)
                      {
                      
                       }
                }
    }
}
 
public class MyClass1 {
    public static void main(String args[]){
             System.out.println("currentThreadName= "+ Thread.currentThread().getName());
        MyThread obj=new MyThread();   
      MyThread1 obj1=new MyThread1();
      Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
       try{Thread.sleep(10);} catch(Exception e){}
       t2.start();              
                                    
                     
    }
}
 