package lec_08_ObjectandClass;

public class OverloadingExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
     public static void main(String[] args) {
        System.out.println(OverloadingExample.add(1, 2));
        System.out.println(OverloadingExample.add(1, 2, 3));
}
}
    