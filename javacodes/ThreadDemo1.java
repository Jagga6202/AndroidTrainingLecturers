class Hi1 implements Runnable
{
  public void run()
  {
   for(int i=1;i<=5;i++)
   {
     System.out.println("Hi");
     try{Thread.sleep(500);}catch(Exception e){}
   }
  }
}
class Hello1 implements Runnable
{
  public void run()
  {
   for(int i=1;i<=5;i++)
   {
    System.out.println("Hello");
    try{Thread.sleep(500);}catch(Exception e){}
   }
  }
}
public class ThreadDemo1
{
 public static void main(String args[])
 {
  Hi obj1=new Hi();
  Thread t1=new Thread(obj1);
  Hello obj2 =new Hello();
  Thread t2=new Thread(obj2);
  t1.start();
try{Thread.sleep(10);}catch(Exception e){}
   t2.start();
 }
}
