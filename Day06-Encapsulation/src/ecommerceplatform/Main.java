package ecommerceplatform;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Electronics smartwatch = new Electronics(101,"smartwatch",5000,25,5);
        Clothing coOrdSet = new Clothing(201,"co-ordSet", 1200, 20,5);
        Groceries cornFlour = new Groceries(301,"cornFlour",200,15,2);

        ArrayList<Product> product = new ArrayList<>();
        product.add(smartwatch);
        product.add(coOrdSet);
        product.add(cornFlour);

        System.out.println("****************************************");
        for(Product p : product){
            p.displayDetails();
            if(p instanceof Taxable){
                System.out.println("The tax on " + p.getName() + " is " + ((Taxable) p).getTaxDetails());
            }
            System.out.println("The discount amount is : "+ p.calculateDiscount());

            if (p instanceof Taxable) {
                System.out.println("After all deduction the new price is :" + (p.getPrice() + ((Taxable) p).calculateTax() - p.calculateDiscount()));
            }
            else{
                System.out.println("After all deduction the new price is :" + (p.getPrice() - p.calculateDiscount()));
            }

            System.out.println("*******************************************");
        }
    }
}
