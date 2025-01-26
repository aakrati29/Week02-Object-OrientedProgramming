package onlinefooddeliverysystem;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private double quantity;

    FoodItem(String itemName, double price, double quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public double getPrice(){
        return  price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    abstract void calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Item name is : " + getItemName());
        System.out.println("Item price is : "+ getPrice());
        System.out.println("Item quantity is : " + getQuantity());
    }
}
