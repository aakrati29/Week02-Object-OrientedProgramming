class MovieTicket {
	String movieName;
	int seatNumber;
	int price;
	
	// Initializing constructor
	MovieTicket(String movieName){
		this.movieName = movieName;
		seatNumber = -1;
		price = 0;
	}
	
	// Create a method to booking ticket
	public void ticketBooking(int seatNumber, int price){
		seatNumber = 2;
		price = 120;
		System.out.println("Ticket booking successfull");
	}
		
	
	// Create a method to display the details of Movie Ticket
	public void displayTicketDetails(){
		System.out.println("----------Display details----------");
		System.out.println("Movie name : " + this.movieName);
		System.out.println("Seat number : " + this.seatNumber);
		System.out.println("Price : " + this.price);
	}
}

public class MovieTicketBooking{

	public static void main(String [] args){
	
	// Create object of MovieTicket class
	MovieTicket movie = new MovieTicket("Jawan");
	movie.ticketBooking(2, 100);
	movie.displayTicketDetails();
	}
}