package ecommerceplatform;

public class Clothing extends Product implements Taxable{
    private double discount;
    private double tax;
    Clothing(int productID, String name, int price,double discount, double tax) {
        super(productID, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discount/100);
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * (tax/100);
    }

    @Override
    public double getTaxDetails() {
        return tax;
    }
}
