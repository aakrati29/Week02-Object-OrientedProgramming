class MobilePhone {
	String brand;
	String model;
	int price;
	
	// Initializing constructor
	MobilePhone(String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	// Create a method to display the details of MobilePhone
	public void displayDetails(){
		System.out.println("----------Display result----------");
		System.out.println("Brand of mobile phone : " + this.brand);
		System.out.println("Model of mobile phone : " + this.model);
		System.out.println("Price of mobile phone : " + this.price);
	}
}

public class  HandleMobilePhoneDetails{

	public static void main(String [] args){
		
		// Create object of MobilePhone class
		MobilePhone mobilePhone = new MobilePhone("iPhone", "iPhone 14", 120000);
		mobilePhone.displayDetails();
	}
}
