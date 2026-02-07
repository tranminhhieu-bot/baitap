package O_Exercise1;

import java.util.ArrayList;

abstract class Book {
    protected String id;
    protected String title;
    protected double price;

    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public abstract double getAmount();

    public void display() {
        System.out.println(id + " | " + title + " | " + price);
    }
}

class ReferenceBook extends Book {
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
        System.out.println("Tax: " + tax + " | Amount: " + getAmount());
    }
}

public class BookList {
    private ArrayList<Book> list = new ArrayList<>();

    
    public void add(Book b) {
        list.add(b);
    }

    // Find by id
    public Book find(String id) {
        for (Book b : list) {
            if (b.getId().equals(id)) return b;
        }
        return null;
    }

    // Delete by id
    public boolean delete(String id) {
        Book b = find(id);
        if (b != null) {
            list.remove(b);
            return true;
        }
        return false;
    }

    // Display all
    public void displayAll() {
        for (Book b : list) {
            b.display();
            System.out.println("-----");
        }
    }

    // Main test
    public static void main(String[] args) {
        BookList bl = new BookList();

        bl.add(new ReferenceBook("R1","Math Ref",100,10));
        bl.add(new ReferenceBook("R2","Physics Ref",120,12));

        bl.displayAll();

        System.out.println("Find R1:");
        Book f = bl.find("R1");
        if (f != null) f.display();

        bl.delete("R2");
        System.out.println("After delete:");
        bl.displayAll();
    }
}