class Person{
protected String fname="Aby";
protected String lname="Syril";
protected String email="123@gmail";
protected int age=18;
}

class Student extends Person{
private int graduationName=2028;

public static void main(String[] args){
Student myObj = new Student();
System.out.print(myObj.fname+"  "+myObj.lname+"  Passed out on the year "+myObj.graduationName);
}
}
