package lec_08_ObjectandClass;

public class OverloadingExample2 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
     public static void main(String[] args) {
        System.out.println(OverloadingExample2.multiply(1, 2));
}
}


