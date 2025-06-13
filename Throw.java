public class Throwcheck{

public static void checkAge(int age) throws ArithmeticException{
if(age>18){
throw new ArithmeticException("Access denied your age is less than 18");
}
else{
System.out.print("Access granted : you can enter");
}
}

public static void main(String[] args){
checkAge(15);
}
}
