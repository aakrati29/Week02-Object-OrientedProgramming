package ridehailingapplication;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR001", "Aakrati", 20.0);
        Vehicle bike = new Bike("BIKE001", "Ankit", 15);
        Vehicle auto = new Auto("AUTO001", "Anand", 10.0);

        // Update and Display GPS Locations
        GPS carGPS = (Car) car;
        carGPS.updateLocation("Upper Lake");
        System.out.println("Car Location: " + carGPS.getCurrentLocation());

        GPS bikeGPS = (Bike) bike;
        bikeGPS.updateLocation("New Market");
        System.out.println("Bike Location: " + bikeGPS.getCurrentLocation());

        GPS autoGPS = (Auto) auto;
        autoGPS.updateLocation("MP Nagar");
        System.out.println("Auto Location: " + autoGPS.getCurrentLocation());

        // Calculate and Display Fares
        double distance = 10.5; // Distance in Km
        System.out.println("\nFare Details:");
        System.out.println("Car Fare: " + car.calculateFare(distance));
        System.out.println("Bike Fare: " + bike.calculateFare(distance));
        System.out.println("Auto Fare: " + auto.calculateFare(distance));
    }
}
