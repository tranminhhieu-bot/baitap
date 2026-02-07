package O_Exercise1;

public abstract class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract double getAmount();

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    // ===== class con trong cùng file =====
    static class TextBook extends Book {
        public TextBook(String title, double price) {
            super(title, price);
        }

        @Override
        public double getAmount() {
            return getPrice();
        }
    }
    static class MainTest {
        public static void main(String[] args) {
            TextBook b = new TextBook("Java Basic", 150);
            b.display();
            System.out.println("Amount: " + b.getAmount());
        }
    }
}
