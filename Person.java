package lec_11;

public class Person {
    public String name;
    public double weight;
}

class EncapsulationExist {

    public static void main(String[] args) {

        Person a = new Person();
        a.name = "Trang";
        a.weight = 10;

        System.out.println(a.name + " - " + a.weight);
    }
}
