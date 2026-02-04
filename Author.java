package lec09_Inheritance.Super;

public class Author {
   private String authorID;
    private String name;

    public Author(String authorID, String name) {
        this.authorID = authorID;
        this.name = name;
    }

    public Author() {
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorID='" + authorID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Book {
    private String BookID;
    private String title;
    private Author author;

    public Book(String BookID, String title, Author author) {
        this.BookID = BookID;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public String getID() {
        return BookID;
    }

    public void setID(String ID) {
        this.BookID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID='" + BookID + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}

class Processor {
    public static void main(String[] args) {
        Author author = new Author("101", "Napoleon Hill");
        Book book = new Book("1", "Think And Grow Rich", author);

        System.out.println("Book information: " + book);
    }
}

