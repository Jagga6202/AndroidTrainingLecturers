import java.util.*;

public class ForEach{
public static void main(String[] args)
{
ArrayList<Integer> list= new ArrayList<Integer>();
list.add(23);
list.add(65);
list.add(60);
list.add(70);

for(Integer object:list){
System.out.println(object);
}

}
}