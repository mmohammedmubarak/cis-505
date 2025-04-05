/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_4.BowlingShopApp;

import java.util.Arrays;
import java.util.Scanner;

public class TestBowlingShopApp {

    /**
     * Static Method to display the menu options
     */
    public static void displayMenu() {
        System.out.print(
                "  MENU OPTIONS\n    1. <b> Bowling Balls\n    2. <a> Bowling Bags\n    3. <s> Bowling Shoes\n    4. <x> To exit\n\n  Please choose an option: ");
    }  // end displayMenu

    public static void main(String[] args) {
        printIndentedWithTwoSpaces("Welcome to the Bowling Shop");
        System.out.print("\n\n");
        Scanner scanner = new Scanner(System.in);
        String menuSelected;
        do {  // do while loop to display the menu option first and perform action based on input
            System.out.print("\n");
            displayMenu();
            menuSelected = scanner.next();
            System.out.print("\n");
            String[] validMenuOptions = { "b", "a", "s", "x" };
            if (Arrays.asList(validMenuOptions).contains(menuSelected)) {  // Check if valid option is entered by the user
                if (!menuSelected.equals("x")) {  // Proceed to product display if exit option is not selected
                    GenericQueue<Product> products = ProductDB.getProducts(menuSelected);
                    System.out.print("  --Product Listing--\n");
                    while (products.size() > 0) {
                        System.out.println(products.dequeue().toString());  // invoke dequeue method to display the products

                    }
                }
            } else {
                System.out.println("  Invalid Option entered. Try again!");  // Message when invalid option is entered
            }

        } while (!menuSelected.equals("x"));  // Repeat display menu until user enters to exit
        System.out.print("\n");
        printIndentedWithTwoSpaces("End of line...");
        scanner.close();
    }

    /**
     * Method which prints the message by prefixing with two spaces as per
     * assignment guidelines
     * 
     * @param printMessage
     */
    public static void printIndentedWithTwoSpaces(String printMessage) {
        System.out.print("  " + printMessage);
    } // end printIndentedWithTwoSpaces
}
