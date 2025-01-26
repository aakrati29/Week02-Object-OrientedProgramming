package vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable{
    private String insuranceNumber;
    Truck(String vehicleNumber, String vehicleType, int rentalRate, String insuranceNumber) {
        super(vehicleNumber, vehicleType, rentalRate);
        this.insuranceNumber = insuranceNumber;
    }

    public double calculateRentalCost(int days){
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance number is : " + insuranceNumber;
    }
}
