package lec_08_ObjectandClass;

public class PromotionExample {
    public static int add(int a, int b) {
 return a + b;
 }
 // Overloaded method to add two doubles
 public static double add(double a, double b) {
 return a + b;
 }
 public static void main(String[] args) {
 System.out.println(add(1, 2));
 System.out.println(add(1.1,2 ));
 }
}
