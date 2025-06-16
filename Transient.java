import java.io.*;

public class Transient{
public static void main(String[] args){
Person person = new Person();
person.fname="John";
person.lname="Doe";
person.age=24;
person.accessCode=5044;

ByteArrayOutputStream output = new ByteArrayOutputStream();
try{
ObjectOutputStream objOut = new ObjectOutputStream(output);
objOut.writeObject(person);
}
catch(IOException e){}

Person person2 = new Person();
try{
ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(output.toByteArray()));
person2 = (Person)objIn.readObject();
}
catch(Exception e){}

System.out.print("first name"+person2.fname);
System.out.print("Last name: "+person2.lname);
System.out.print("Age: "+person2.age);
System.out.print("Access code: "+person2.accessCode);
}
}
class Person implements Serializable{
String fname="John";
String lname="Doe";
int age =24;
transient int accessCode=0;
}
