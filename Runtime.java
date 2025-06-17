class Animal{
void sound(){
System.out.print("The animal produces sound");
}
}

class Dog extends Animal{

void sound(){
System.out.print("Bow Bow");
}
}

class Cat extends Animal{
void sound(){
System.out.print("Meow Meow");
}
}

public class Runtime{
public static void main(String[] args){

Animal myAnimal = new Dog();

myAnimal.sound();

myAnimal = new Cat();

myAnimal.sound();
}
}