import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Create a method to display product details
    public String toString() {
        return "Product Name: " + name + ", Price: $" + price;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    int orderId;
        private Customer customer;
        private ArrayList<Product> products;
    
        public Order(int orderId, Customer customer) {
            this.orderId = orderId;
            this.customer = customer;
            this.products = new ArrayList<>();
        }
    
        // Create a method to add a product to the order
        public void addProduct(Product product) {
            products.add(product);
        }
    
        // Create a method to calculate the total price of the order
        public double calculateTotal() {
            double total = 0;
            for (Product product : products) {
                total += product.getPrice();
            }
            return total;
        }
    
        // Display order details
        public void displayOrderDetails() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Customer: " + customer.getName());
            System.out.println("Products in the Order:");
            for (Product product : products) {
                System.out.println("  " + product);
            }
            System.out.println("Total Price: $" + calculateTotal());
        }
    }
    
    class Customer {
        private String name;
        private ArrayList<Order> orders;
    
        // Constructor to initialize customer details
        public Customer(String name) {
            this.name = name;
            this.orders = new ArrayList<>();
        }
    
        // Create a method to place an order
        public void placeOrder(Order order) {
            orders.add(order);
            System.out.println(name + " placed Order ID: " + order.orderId);
    }

    // Display all orders of the customer
    public void displayOrders() {
        System.out.println("Customer: " + name);
        System.out.println("Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }

    public String getName() {
        return name;
    }
}

public class EcommercePlatform {

    public static void main(String[] args) {
        // Creating customers objects
        Customer customer1 = new Customer("Aakrati");
        Customer customer2 = new Customer("Ankit");

        // Creating products
        Product product1 = new Product("Laptop", 58999.99);
        Product product2 = new Product("Guitar", 4000.00);
        Product product3 = new Product("Headphones", 6000.00);
        Product product4 = new Product("SmartWatch", 5000.00);

        // Creating orders for Aakrati
        Order order1 = new Order(101, customer1);
        order1.addProduct(product1);
        order1.addProduct(product3);

        Order order2 = new Order(102, customer1);
        order2.addProduct(product4); 

        // Creating orders for Ankit
        Order order3 = new Order(201, customer2);
        order3.addProduct(product2); 
        order3.addProduct(product3); 

        // Customers place their orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer2.placeOrder(order3);

        // Displaying Alice's orders
        customer1.displayOrders();

        // Displaying Bob's orders
        customer2.displayOrders();
    }
}
