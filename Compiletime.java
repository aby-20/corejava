class Calculator{

public int add(int a,int b){
return a+b;
}

public int add(int a, int b, int c){
return a+b+c;
}
}

public class Compiletime{
public static void main(String[] args){

Calculator calc = new Calculator();

System.out.print(calc.add(10,20));
System.out.print(calc.add(10,20,30));
}
}
