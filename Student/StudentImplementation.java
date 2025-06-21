import java.util.ArrayList;


public class StudentImplementation implements Student{

ArrayList<StudentDetails> studentList = new ArrayList<>();

public void addStudent(String name,int rollNo,int mark){
StudentDetails s = new StudentDetails(name,rollNo,mark);
studentList.add(s);
}
public void readStudent(){
if(studentList.isEmpty()){
System.out.print("There is no students");
}
else{
for(StudentDetails s :studentList){
System.out.print(s);
}
}
}
}





