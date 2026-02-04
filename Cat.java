package lec09_Inheritance.Super;

public class Cat {
    String catID = "cat";
String source = "VietNam";
void makeSound() {
System.out.println("Make a sound");
}
void catchMouse(){
System.out.println("Catch the mouse");
}

public static void main(String[] args) {
Cat cat = new Cat();
System.out.println("ID: " + cat.catID);
System.out.println("Source: " +
cat.source);
cat.makeSound();
cat.catchMouse();
}
}
