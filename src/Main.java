// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class LibraryItem {
    private int id;
    private String title;
    private int year;

    public LibraryItem(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(int id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Magazine extends LibraryItem {
    private int issue;

    public Magazine(int id, String title, int year, int issue) {
        super(id, title, year);
        this.issue = issue;
    }

    public int getIssue() {
        return issue;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Book and Magazine
        Book book1 = new Book(01, "time machine", 2003, "adwin sharma");
        Magazine magazine1 = new Magazine(5, "train flicking", 2010, 7);

        // Display information about the items
        System.out.println("Book id: " + book1.getId());
        System.out.println("Book title: " + book1.getTitle());
        System.out.println("Book year: " + book1.getYear());
        System.out.println("Book author: " + book1.getAuthor());

        System.out.println();

        System.out.println("Magazine id: " + magazine1.getId());
        System.out.println("Magazine title: " + magazine1.getTitle());
        System.out.println("Magazine year: " + magazine1.getYear());
        System.out.println("Magazine issue: " + magazine1.getIssue());
    }
}