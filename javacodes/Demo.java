import java.util.Scanner; 
class Student {
    int rollno;
    String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo extends Student{
  public static void main(String args[])
  {
   Student s =new Student();
   Scanner in=new Scanner(System.in);
   System.out.println("Enter Rollno");
   s.setRollno(in.nextInt());
   Scanner in1=new Scanner(System.in);
   System.out.println("Enter Name");
   s.setName(in1.nextLine());
 
   Student s1 =new Student();
   s1.setRollno(2);
   s1.setName("Ravi");

   System.out.println("First Student Details:-"+"RollNo="+s.getRollno()+"Name="+s.getName());
   System.out.println("Second Student Details:-"+"RollNo="+s1.getRollno()+"Name="+s1.getName());

  }

}