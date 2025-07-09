package oops;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john@example.com", 'M');
        Book book = new Book("Java Programming", author, 599.99, 10);
        
        System.out.println(book);
    }
}
