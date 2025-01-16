class Book{
	String title;
	String author;
	int price;
	
	// Initializing constructor
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// Create a method to display the details of books
	public void displayDetails(){
		System.out.println("----------Display result----------");
		System.out.println("Title of book : " + this.title);
		System.out.println("Author of book : " + this.author);
		System.out.println("Price of book : " + this.price);
	}
}
		
public class HandleBookDetails{
	public static void main(String [] args){
	
	// Create object of book class
	Book book = new Book("Life", "Ram Gupta", 1000);
	book.displayDetails();
	}
}