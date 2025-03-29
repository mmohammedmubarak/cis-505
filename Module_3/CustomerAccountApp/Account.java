/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_3.CustomerAccountApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Module_2.SportsTeamApp.TestSportsTeamApp;

public class Account {
    private double balance = 200;

    /**
     * Accessor method to get balance
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    } // end getBalance

    /**
     * Method to increase balance based on deposit amount
     * 
     * @param amt
     */
    public void deposit(double amt) {
        balance = balance + amt;
    } // end deposit

    /**
     * Method to check and decrease balance based on withdraw amount
     * 
     * @param amt
     */
    public void withdraw(double amt) {
        if (balance >= amt)
            balance = balance - amt;
        else {
            System.out.print("\n");
            TestSportsTeamApp.printIndentedWithTwoSpaces("Withdrawal rejected due to insufficient balance\n");
        }
    } // end withdraw

    /**
     * Method to display menu to user to perform operation on the account
     */
    public void displayMenu() {
        TestSportsTeamApp.printIndentedWithTwoSpaces("Account Menu\n");
        TestSportsTeamApp.printIndentedWithTwoSpaces("Enter <D/d> for deposit\n");
        TestSportsTeamApp.printIndentedWithTwoSpaces("Enter <W/w> for withdraw\n");
        TestSportsTeamApp.printIndentedWithTwoSpaces("Enter <B/b> for balance\n");
        TestSportsTeamApp.printIndentedWithTwoSpaces("  Enter option>: ");
    } // end displayMenu

    /**
     * Method to return current date in MM-dd-yyyy format
     * 
     * @return date
     */
    public String getTransactionDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    } // end getTransactionDate

}
