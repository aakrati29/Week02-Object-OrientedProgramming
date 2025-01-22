import java.util.ArrayList;

// Book class
class Book {
    private String title;
    private String author;

    // Create a constructor for book class
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Library class
class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Craete a method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library : ");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}

public class LibraryAndBooks {

    public static void main(String[] args){
	
        // Creating some books
        Book book1 = new Book("Life", "J.D. Gupta");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        // Creating libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        // Displaying books in libraries
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
