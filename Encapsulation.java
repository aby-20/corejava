class Student{
private String name;
private int age;

public String getName(){
return name;
}

public void setName(String newName){
name = newName;
}

public int getAge(){
return age;
}

public void setAge(int newAge){
if(newAge>0){
age=newAge;
}
else{
System.out.print("Age invalid Please provide a Positive number");
}
}
}
public class Encapsulation{
public static void main(String[] args){
Student student = new Student();

student.setName("Aby");
student.setAge(19);

System.out.print("Name  "+ student.getName());
System.out.print("Age "+ student.getAge());

}
}
