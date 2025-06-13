public class Do{
public static void main(String[] args){
int i=1;
{
do{
if(i==3){
i++;
continue;
}
i++;
System.out.print(i);
}while(i<=5);
}
}
}