import java.util.ArrayList;
import java.util.List;

// Define the Book class
class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

// Define the LibraryOperations interface
interface LibraryOperations {
    void addBook(Book book);
    void listAllBooks();
}

// Implement the Library class
class Library implements LibraryOperations {
    public List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("*Added book: " + book.title + " by " + book.author);
    }

    @Override
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("List of all books:");
            for (Book book : books) {
                System.out.println("Title: " + book.title + ", Author: " + book.author);
            }
        }
    }
}

// Main class to test the library system
public class LibrarySystem {
    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();
        System.out.println();

        // Create books
        Book book1 = new Book("Java Basics", "John Doe");
        Book book2 = new Book("Advanced Java", "Jane Smith");
        
        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // List all books in the library
        library.listAllBooks();
        System.out.println();

    }
}
