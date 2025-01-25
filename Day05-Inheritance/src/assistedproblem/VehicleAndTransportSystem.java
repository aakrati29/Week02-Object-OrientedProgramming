package assistedproblem;

class Vehicle {
    int maxSpeed;
    String fuelType ;

    Vehicle(){}

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Print Nothing");
    }
}

class Car extends Vehicle{
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("---------Car details----------");
        System.out.println("Maximum speed of car : " + maxSpeed);
        System.out.println("Fuel Type of car : " + fuelType);
        System.out.println("Seat capacity of car " + seatCapacity);
    }
}

class Truck extends Vehicle{
    int wheel;

    Truck(int maxSpeed, String fuelType, int wheel){
        super(maxSpeed, fuelType);
        this.wheel = wheel;
    }

    @Override
    public void displayInfo(){
        System.out.println("---------Truck details----------");
        System.out.println("Maximum speed of Truck : " + maxSpeed);
        System.out.println("Fuel Type of Truck : " + fuelType);
        System.out.println("Wheel of Truck " + wheel);
    }
}

class MotorCycle extends Vehicle{
    int seatCapacity;

    MotorCycle(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("---------Motor Cycle details----------");
        System.out.println("Maximum speed of MotorCycle : " + maxSpeed);
        System.out.println("Fuel Type of MotorCycle : " + fuelType);
        System.out.println("Seat capacity of MotorCycle " + seatCapacity);
    }
}

public class VehicleAndTransportSystem{

    public static void main(String [] args){
        Vehicle vehicle = new Vehicle();
        vehicle.displayInfo();

        Car car  = new Car(100, "diesel", 4);
        car.displayInfo();

        Truck truck = new Truck(60, "diesel", 14);
        truck.displayInfo();

        MotorCycle motorcycle = new MotorCycle(60, "petrol", 3);
        motorcycle.displayInfo();
    }
}
