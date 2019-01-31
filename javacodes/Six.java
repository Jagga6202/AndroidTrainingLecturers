class Four{
void method_four(){
System.out.println("method four");
}

}

class Five extends Four{
void method_five(){
System.out.println("method five");
}

}

class Six extends Four{
void method_six(){
System.out.println("method six");
}

public static void main(String args[]){

Six s=new Six();
s.method_four();
s.method_six();


}

}