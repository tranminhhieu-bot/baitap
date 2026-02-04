package lec_08_ObjectandClass;

public class Car {
    private String model;
 private int year;

 public Car(String model, int year) {
 this.model = model;
 this.year = year;
 }

 public void displayDetails() {
 System.out.println("Car Model: " + model + ", Year: " + year);
 Car myCar = new Car("Lamborghini", 2020);
 myCar.displayDetails();
}
  public static void main(String args[]) {
      
  }
}
