package hybridinheritance;

class Vehicle{
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails(){
        System.out.println("Model : " + model + ", MaxSpeed : " + maxSpeed + " km/hr.");
    }
}

// interface Refuelable
interface Refuelable {
    public void refuel();
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model){
        super(maxSpeed, model) ;
    }

    public void charge(){
        System.out.println("This is charging vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable{
    PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }

    @Override
    public void refuel(){
        System.out.println("This is petrol vehicle");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(60, "scooty");
        ev.charge();
        ev.displayDetails();

        PetrolVehicle pv = new PetrolVehicle(80, "Bike");
        pv.refuel();
        pv.displayDetails();
    }
}

