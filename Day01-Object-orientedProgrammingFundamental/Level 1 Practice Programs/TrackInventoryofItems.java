class Items{
	int itemCode;
	String itemName;
	int itemPrice;
	int total;
	
	// Initializing constructor
	Items(int itemCode, String itemName, int itemPrice){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	// Create a method to display the details of Items
	public void displayDetails(){
		System.out.println("----------Display result----------");
		System.out.println("ItemCode : " + this.itemCode);
		System.out.println("ItemName : " + this.itemName);
		System.out.println("ItemPrice : " + this.itemPrice);
	}
	
	// Create a method to calculate total
	public void calculate (int quantity){
		total = this.itemPrice * quantity;
		System.out.println("Total cost for a given quantity : " + total);
	}	
}
		
public class TrackInventoryofItems{
	public static void main(String [] args){
		
	// Create object of Items class
	Items item = new Items(01, "Dosa", 60);
	item.displayDetails();
	item.calculate(2);
	}
}