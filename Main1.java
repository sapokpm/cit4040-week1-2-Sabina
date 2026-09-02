import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert Martin", 464);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 412);
        Book book3 = new Book("The Pragmatic Programmer", "David Thomas", 352);
        Book book4 = new Book("Java Concurrency in Practice", "Brian Goetz", 208);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book b : books) {
            System.out.println(b.describe());
        }

        int count = 0;
        for (Book b : books) {
            if (b.getPages() > 300) {
                count++;
            }
        }
        System.out.println("Books with more than 300 pages: " + count);
    }
}
