import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

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

        Map<String, Integer> stock = new HashMap<>();
        stock.put("Clean Code", 5);
        stock.put("Effective Java", 3);
        stock.put("The Pragmatic Programmer", 7);
        stock.put("Java Concurrency in Practice", 2);

        System.out.println("Stock for Clean Code: " + stock.get("Clean Code"));

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int total = 0;
        for (int c : stock.values()) {
            total += c;
        }
        System.out.println("Total copies: " + total);
    }
}
