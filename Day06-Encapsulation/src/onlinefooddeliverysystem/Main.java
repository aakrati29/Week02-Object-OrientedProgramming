package onlinefooddeliverysystem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VegItem veg = new VegItem("Dosa",160,2);
        NonVegItem nonVeg = new NonVegItem("Chicken", 450,1);

        veg.applyDiscount(3.0);
        nonVeg.applyDiscount(10.0);

        ArrayList<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(veg);
        foodItems.add(nonVeg);

        System.out.println("******************************************");

        for(FoodItem item : foodItems){
            item.getItemDetails();

            if(item instanceof Discountable){
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }
            item.calculateTotalPrice();
            System.out.println("******************************************");
        }
    }
}
