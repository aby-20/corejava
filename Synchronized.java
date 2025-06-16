public class Synchronized implements Runnable{
public static int a,b;

public static void main(String[] args){
a=100;
b=100;

System.out.print("Total before:"+(a+b));

Thread thread1 = new Thread(new Synchronized());
Thread thread2 = new Thread(new Synchronized());
thread1.start();
thread2.start();

try{
thread1.join();
thread2.join();
}
catch(InterruptedException e){
e.printStackTrace();
}
System.out.print("Total after: "+(a+b));
}

public void run(){
for(int i =0;i<10000000;i++){
transfer();
}
}
public static synchronized void transfer(){
int amount=(int) (5.0*Math.random());

if (a>b){
a-= amount;
b+= amount;
}
else{
a+= amount;
b-= amount;
}
}
}