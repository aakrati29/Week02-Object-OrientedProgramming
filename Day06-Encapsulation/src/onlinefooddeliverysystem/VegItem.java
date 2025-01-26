package onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable{
    private double discount;
    private final double deliveryCharge = 40.0;
    VegItem(String itemName, double price, double quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount is " + discount + "%";
    }

    @Override
    public void calculateTotalPrice() {
        System.out.println("Total price is : " + ((getPrice() * getQuantity() * (1 - discount / 100)) + deliveryCharge));

    }
}
