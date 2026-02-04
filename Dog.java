package lec09_Inheritance.Super;

public class Dog {
    String dogID = "dog";
String source = "VietNam";
void makeSound() {
System.out.println("Make a sound");
}
void guardHouse(){
System.out.println("Guard the house");
}
public static void main(String[] args) {
Dog dog = new Dog();
System.out.println("ID: " + dog.dogID);
System.out.println("Source: " +
dog.source);
dog.makeSound();
dog.guardHouse();
}
}
