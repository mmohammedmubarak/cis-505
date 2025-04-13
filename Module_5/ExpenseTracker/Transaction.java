/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_5.ExpenseTracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {

    // private fields for the class
    private String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    private String description = "";
    private double amount = 0.0;

    // Getters and Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // No Argument Constructor
    public Transaction() {

    }

    // Argument Constructor
    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Override toString method with the custom description
    @Override
    public String toString() {
        System.out.printf("  Date: %s\n  Description: %s\n  Amount: $%,6.2f", date, description, amount);
        return "";
    }
}
