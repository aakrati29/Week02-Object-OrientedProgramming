class Book {
    public String ISBN;
    protected String title;
    private String author;        
	
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Create a method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Create a method to get the author name
    public String getAuthor() {
        return author;
    }

    // Create a method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends Book {
    private String downloadURL;

    // Constructor to initialize ISBN, title, author, and downloadURL
    public EBook(String ISBN, String title, String author, String downloadURL) {
        super(ISBN, title, author); // Call the superclass constructor
        this.downloadURL = downloadURL;
    }

    // Create a method to display eBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN : " + ISBN); 
        System.out.println("Title : " + title); 
        System.out.println("Author : " + getAuthor()); 
        System.out.println("Download URL : " + downloadURL);
    }
}
public class BookLibrarySystem {

    public static void main(String[] args) {
	
        // Create a Book object 
        Book book1 = new Book("978-16-148410", "Java Programming", "James Gosling");
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Modify the author name
        book1.setAuthor("John Doe");
        System.out.println("Updated Book Details :");
        book1.displayBookDetails();

        // Create an EBook object
        EBook ebook1 = new EBook("978-4028-9462-6", "Learning Python", "Mark Lutz", "www.ebooks.com/learning-python");
        System.out.println("EBook Details:");
        ebook1.displayEBookDetails();
    }
}
