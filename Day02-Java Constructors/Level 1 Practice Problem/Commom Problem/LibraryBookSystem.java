class Book{
	String title;
	String author;
	int price;
	boolean availability;
	
	// Initializing parameterized constructor
	Book(String title, String author, int price, boolean availability){
		this.title = title;
		this.author = author; 
		this.price = price;
		this.availability = availability;
	}
	
	public void borrowBook(){
		if(availability){
			System.out.println("Book issued");
			availability = false;
		}
		else{
			System.out.println("Book is not available");
		}
	}		
}
	
public class LibraryBookSystem{
	public static void main(String [] args){
		Book book = new Book("Life", "Ram gupta", 200, true);
		book.borrowBook();
	}
}