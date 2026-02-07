package O_Exercise1;

abstract class Book {
    protected String title;
    protected double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public abstract double getAmount();

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class TextBook extends Book {
    private int pages;

    public TextBook(String title, double price, int pages) {
        super(title, price);
        this.pages = pages;
    }

    @Override
    public double getAmount() {
        return price;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Pages: " + pages);
    }
}

public class IBook {
    public static void main(String[] args) {
        TextBook tb = new TextBook("Java Basic", 180, 320);
        tb.display();
        System.out.println("Amount: " + tb.getAmount());
    }
}
