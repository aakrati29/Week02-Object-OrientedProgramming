class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	
	// Initializing default constructor
	HotelBooking(){
		guestName = "Ram";
		roomType = "Single";
		nights = 2;
	}
	
	// Initializing parameterized constructor
	HotelBooking(String guestName, String roomType, int  nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	// Initializing parameterized constructor
	HotelBooking(HotelBooking previousData){
		this.guestName = previousData.guestName;
		this.roomType = previousData.roomType;
		this.nights = previousData.nights;
	}
	
	// Create a method to display details
	public void display(){
		System.out.println("-----------Display Details-----------");
		System.out.println("Guest name is : " + this.guestName);
		System.out.println("Room Type is : " + this.roomType);
		System.out.println("Nights : " + this.nights);
	}
}
	
public class HotelBookingSystem{
	public static void main(String [] args){
	
	// Create a object of default constructor
	HotelBooking h1 = new HotelBooking();
	
	// Create a object of parameterized constructor
	HotelBooking h2 = new HotelBooking("Aakrati", "Single", 1);
	
	// Create a object of copy constructor
	HotelBooking h3 = new HotelBooking(h1);
	
	h3.display();
	
	}
}