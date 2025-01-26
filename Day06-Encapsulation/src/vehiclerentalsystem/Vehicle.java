package vehiclerentalsystem;

abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private int rentalRate;

    Vehicle(String vehicleNumber, String vehicleType, int rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    //Getter and setter methods
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public int getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(int rentalRate){
        this.rentalRate = rentalRate;
    }

    public void displayDetails(){
        System.out.println("Vehicle number is : " + vehicleNumber);
        System.out.println("Vehicle type is : " + vehicleType);
        System.out.println("One day rentalRate is : " + rentalRate);
    }
}
