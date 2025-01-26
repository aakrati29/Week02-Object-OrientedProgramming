package vehiclerentalsystem;

public class Car extends Vehicle implements Insurable{
    private String insuranceNumber;
    Car(String vehicleNumber, String vehicleType, int rentalRate, String insuranceNumber) {
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
        return "Insurance is : " + insuranceNumber;
    }
}
