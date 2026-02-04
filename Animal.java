package lec_10;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public abstract void makeSound();
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Barks barks");
    }
}
class Processor {

    public static void main(String[] args) {

        Dog dog = new Dog("Lulu");

        dog.displayName();
        dog.makeSound();

    }
}