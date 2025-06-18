import java.util.ArrayList;
import java.util.Collections;

public class Array{
public static void main(String[] args){

ArrayList<String> fruits = new ArrayList<>();

fruits.add("Orange");
fruits.add("Apple");
fruits.add("PineApple");
fruits.add("Mango");

Collections.sort(fruits);

System.out.print(fruits);
}
}
