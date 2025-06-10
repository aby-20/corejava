public class Prime{
public static void main(String[] args){

int temp=0;
int n=19;
if(n<=1)
{
System.out.print("The number is not prime");
}
for(int i=1;i<=n;i++){
if(n%i==0)
{
temp=temp+1;
}
}
if(temp==2)
{
System.out.print("Number is prime");
}
else{
System.out.print("number is not prime");

}
}
}