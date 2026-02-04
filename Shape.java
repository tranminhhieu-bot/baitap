package lec_10;

public abstract class Shape {

    public abstract double calculateArea();
}

class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Processor {

    public static void main(String[] args) {

        Square square = new Square(2);
        System.out.println("Area of the square: " + square.calculateArea());

    }
}