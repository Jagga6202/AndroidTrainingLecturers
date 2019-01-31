class One{
void method_one(){
System.out.println("method one");
}

}

class Two extends One{
void method_two(){
System.out.println("method two");
}

}

class Three extends Two{
void method_three(){
System.out.println("method three");
}

public static void main(String args[]){

Three t=new Three();
t.method_one();
t.method_two();
t.method_three();

}

}