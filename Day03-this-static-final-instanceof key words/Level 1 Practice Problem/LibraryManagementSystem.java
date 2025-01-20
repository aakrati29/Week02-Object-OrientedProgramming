class Book {
	static String libraryName = "TITExcellence";
	String title;
	String author;
	final int isbn;
	
	Book(String title, String author, int isbn){
		this. title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public static void displayLibraryName(){
		System.out.println("Library Name : " + libraryName);
	}
}
	

public class LibraryManagementSystem{
	public static void main(String [] args){
	Book book1 = new Book("Ramayan", "Balmiki", 01);
	Book book2 = new Book("Life", "Ram Gupta", 01);
	Book book3 = new Book("Look At you", "Aakrati", 01);
	
		Book.displayLibraryName();
		
		if(book1 instanceof Book){
			System.out.println("book1 is instance of Book");
		}
		if(book3 instanceof Book){
			System.out.println("book3 is instance of Book");
		}
	}
}