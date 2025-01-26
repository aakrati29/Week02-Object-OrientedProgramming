package vehiclerentalsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("EF205","Supra",30000,"IN55");
        Bike bike = new Bike("BIK620","Apache",500,"IN104");
        Truck truck = new Truck("TRUCK784","TruckTop",3000,"IN985");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        System.out.println("****************************************");
        for(Vehicle v : vehicles){
            v.displayDetails();
            System.out.println("Total rental price for five days : " + v.calculateRentalCost(5));

            if(v instanceof Insurable insurable){
                System.out.println("Insurance cost is : " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("****************************************");
        }

    }
}
