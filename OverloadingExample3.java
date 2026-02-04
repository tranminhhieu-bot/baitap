package lec_08_ObjectandClass;

public class OverloadingExample3 {
 public static void printInfo(String name, int age) {
 System.out.println("Name: " + name + ", Age: " + age);
 }
 public static void printInfo(int age, String name) {
 System.out.println("Age: " + age + ", Name: " + name);
 }
 public static void main(String[] args) {
OverloadingExample3. printInfo(“Tony”,25);
}
}
 