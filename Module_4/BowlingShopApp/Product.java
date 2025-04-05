/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_4.BowlingShopApp;

public class Product {

    //private fields for the class
    private String code = "";
    private String description = "";
    private double price = 0.0;

    //No Argument Constructor
    public Product() {

    }

    //Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString method with the custom description
    @Override
    public String toString() {
        System.out.printf("  Product Code: %s\n  Description: %s\n  Price: $%,6.2f", code, description, price);
        return "";
    }
}
