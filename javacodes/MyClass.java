class MyThread extends Thread{
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
class MyThread1 extends Thread{
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
 
public class MyClass {
    public static void main(String args[]){
             System.out.println("currentThreadName= "+ Thread.currentThread().getName());
        MyThread obj=new MyThread();   
      MyThread1 obj1=new MyThread1(); 
           obj.start();
           try
                       {
                        Thread.sleep(10);
                       }
                    catch(Exception e)
                      {
                      
                       }
            obj1.start();
            
    }
}
 