class Product {
	static double discount = 10;
	String productName;
	int price;
	int quantity;
	int productId;
	
	Product(String productName, int price, int quantity){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public static void updateDiscount(int newDiscount){
		discount = newDiscount;	
	}
}

public class ShoppingCartSystem{

	public static void main(String [] args){
	Product p1 = new Product("SmartWatch", 3000, 5);
	Product p1 = new Product("Laptop", 60000, 4);
	
		Product.updateDiscount(20);
		
		if(p1 instanceof Product){
			System.out.println("p1 is instance of Product");
		}
		if(p2 instanceof Product){
			System.out.println("p2 is instance of Product");
		}
	}
}