class Book{
	String title;
	String author;
	int price;
	
	// Initializing parameterized constructor
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// Initializing Default constructor
	Book(){
		title = "The Secret";
		author = "Ram gupta";
		price = 150;
	}
	
	public void display(){
		System.out.println("-----------Display Details-----------");
		System.out.println("Title of book is : " + this.title);
		System.out.println("Author of book is : " + this.author);
		System.out.println("Price of book is : " + this.price);
	}
		
}
		
public class BookDemo{
	public static void main(String [] args){
	
	// Create a object of parameterized constructor
	Book book = new Book("Life", "Aakrati Barsaiyan", 200);
	
	// Create a object of Default constructor
	Book book1 = new Book();
	
	book.display();
	}
}
	