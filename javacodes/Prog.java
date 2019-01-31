class Emp{
int salary=40000;
}

class Prog extends Emp{
int bonus=10000;
public static void main(String args[]){
Prog p=new Prog();
System.out.println("Salary is:"+p.salary);
System.out.println("Bouns is:"+p.bonus);
}

}