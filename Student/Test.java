import java.util.Scanner;

public class Test{
public static void main(String[] args){
Scanner scanner  = new Scanner(System.in);
StudentImplementation std = new StudentImplementation();
int choice;
do{
System.out.print("\n Menu \n 1.Add Student \n 2.Read Student \n 3. Exit");
choice = scanner.nextInt();
scanner.nextLine();


if (choice==3) {
System.out.println("Done");
break;
}
switch(choice){
case 1:
System.out.print("Enter Student name");
String name= scanner.nextLine();
System.out.print("Enter Roll Number");
int rollNo = scanner.nextInt();
System.out.print("Enter Mark");
int mark = scanner.nextInt();

std.addStudent(name,rollNo,mark);
System.out.print("Student added successfully");
break;

case 2:
std.readStudent();
break;
}

}
while(true);

scanner.close();
}
}
