package ecommerceplatform;

public class Groceries extends Product implements Taxable{
    private double discount;
    private double tax;
    Groceries(int productId, String name, int price,double discount, double tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculateDiscount() {
        return super.getPrice() * (discount/100);
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
