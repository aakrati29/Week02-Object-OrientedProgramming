import java.util.ArrayList;
import java.util.List;

class CartItem {

    // Public attributes for direct access
    public String itemName;
    public double price;
    public int quantity;

	// Initializing constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Create a method to calculate the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {

    private List<CartItem> cart;

	// Initializing constructor
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    // Create a method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cart) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                item.quantity += quantity; // Update quantity directly
                System.out.println("Updated quantity of " + itemName);
                return;
            }
        }
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Create a method to remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cart) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                cart.remove(item);
                System.out.println("Removed " + itemName + " from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Create a method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total cost: $" + totalCost);
    }

    // Create a method to display the cart items
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Cart items :");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - $" + item.price + " x " + item.quantity);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 0.99, 3);
        cart.addItem("Banana", 0.59, 5);
        cart.displayCart();
        cart.displayTotalCost();

        cart.addItem("Apple", 0.99, 2);
        cart.displayCart();
        cart.displayTotalCost();

        cart.removeItem("Banana");
        cart.displayCart();
        cart.displayTotalCost();
    }
}
