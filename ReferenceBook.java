package O_Exercise1;

abstract class Book {
    protected String id;
    protected String title;
    protected double price;

    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public abstract double getAmount();

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class ReferenceBook extends Book {
    private double tax;

    public ReferenceBook(String id, String title, double price, double tax) {
        super(id, title, price);
        this.tax = tax;
    }

    @Override
    public double getAmount() {
        return price + tax;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tax: " + tax);
    }

    public static void main(String[] args) {
        ReferenceBook rb = new ReferenceBook("R01", "Dictionary", 100, 10);
        rb.display();
        System.out.println("Amount: " + rb.getAmount());
    }
}