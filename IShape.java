package lec_10;

public interface IShape {
    void drawShape();
}

class Circle implements IShape {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }
}

class Processor {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.drawShape();

    }
}