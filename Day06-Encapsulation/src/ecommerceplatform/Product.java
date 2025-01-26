package ecommerceplatform;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public int getProductId(){
        return productId;
    }
    public void setProductID(int productId){
        this.productId = productId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Product ID is : " + productId);
        System.out.println("Product name is : " + name);
        System.out.println("Product price is : " + price);
    }
}
