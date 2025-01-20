class Vehicle{
	static int registrationFee = 1500;
	String ownerName;
	String vehicleType;
	final int registrationNumber;
	
	Vehicle(String ownerName, String vehicleType, int registrationNumber){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}
	
	public static void updateRegistrationFee(int updatedFee){
		registrationFee = updatedFee;
	}
}
		
public class VehicleRegistrationSystem{

	public static void main(String [] args){
	Vehicle v1 = new Vehicle("Ram", "Car", 24);
	Vehicle v2 = new Vehicle("Aakrati", "Bike", 01);
	
		Vehicle.updateRegistrationFee(2000);
	
		if(v1 instanceof Vehicle){
			System.out.println("v1 is instance of Vehicle");
		}
		if(v2 instanceof Vehicle){
			System.out.println("v2 is instance of Vehicle");
		}
	}
}