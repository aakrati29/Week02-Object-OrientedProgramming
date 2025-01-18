class Vehicle {
	String ownerName;
	String vehicleType;
	static double registrationFee = 1500;
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	// Create a method to display details
	public void displayVehicleDetails() {
        System.out.println("Owner Name : " + this.ownerName);
        System.out.println("Vehicle Type : " + this.vehicleType);
		System.out.println("Registration Fee : " + registrationFee);
    } 
	
	// Create a method to update registration Fee
	public static void updateRegistrationName(double newFee){
		registrationFee = newFee;
	}
}
	
public class VehicleRegistration{
	public static void main(String [] args){
	Vehicle v1 = new Vehicle("Ram", "Bike");
	Vehicle v2 = new Vehicle("Aakrati", "Car");
	
	v1.displayVehicleDetails();
	v2.displayVehicleDetails();
	
	Vehicle.updateRegistrationName(2000.0);
	
	v1.displayVehicleDetails();
	v2.displayVehicleDetails();
	}
}