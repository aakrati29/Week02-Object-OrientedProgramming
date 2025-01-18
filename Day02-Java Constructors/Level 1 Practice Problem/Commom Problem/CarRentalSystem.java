class CarRental {
	String customerName;
	String carModel;
	int rentalDays;
	
	// Initializing parameterized constructor
	CarRental(String customerName, String carModel, int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	// Create a method to calculate total cost
	public void totalCost(int price){
		int total = rentalDays * price;
		System.out.println("Total cost is : " + total);
	}
}
		
	
	public class CarRentalSystem{
		public static void main(String [] args){
		CarRental car = new CarRental("Ram", "BMW", 5);
		car.totalCost(1000);
	}
}