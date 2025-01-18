class Product {
	String productName;
	int price;
	static int totalProducts = 0;
	
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	// Create a method to display details
	public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }
	
	// Create a method to display total products
	public static void displayTotalProducts() {
        System.out.println("Total Products : " + totalProducts);
    }
}
	
public class ProductInventory{
	public static void main(String [] args){
	
	// Create objects for products class
	Product product1 = new Product("Guitar", 4000);
	Product product2 = new Product("SmartWatch", 5000);
	
	product1.displayProductDetails();
	product2.displayProductDetails();
	
	Product.displayTotalProducts();
	}
}