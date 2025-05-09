/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_3.CustomerAccountApp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestCustomerAccountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printIndentedWithTwoSpaces("Welcome to the Customer Account App\n\n");
        boolean validCustomerId;
        String customerId;
        do { // do while loop to prompt the user to enter customer id from given list
            validCustomerId = true;
            printIndentedWithTwoSpaces("Enter a customer ID:");
            System.out.print("\n");
            printIndentedWithTwoSpaces("  ex: 1007, 1008, 1009>: ");
            List<String> customerIdList = Arrays.asList("1007", "1008", "1009");
            customerId = scanner.next();
            if (!customerIdList.contains(customerId)) {
                System.out.print("\n");
                printIndentedWithTwoSpaces("Invalid customer id entered. Please try again\n\n");
                validCustomerId = false;
            }
        } while (validCustomerId == false);

        Customer customer = CustomerDB.getCustomer(Integer.parseInt(customerId)); // create customer based on selected
                                                                                  // id
        Account account = new Account();
        String continueOption;
        do {
            boolean validContinueOption = false;
            System.out.print("\n");
            account.displayMenu(); // Display menu to the user
            String menuSelected = scanner.next();
            if (menuSelected.equalsIgnoreCase("d")) { // condition to handle deposit option
                System.out.print("\n");
                printIndentedWithTwoSpaces("Enter deposit amount: ");
                account.deposit(scanner.nextDouble());
                System.out.print("\n");
            } else if (menuSelected.equalsIgnoreCase("w")) { // condition to handle withdraw option
                System.out.print("\n");
                printIndentedWithTwoSpaces("Enter withdraw amount: ");
                account.withdraw(scanner.nextDouble());
                System.out.print("\n");
            } else if (menuSelected.equalsIgnoreCase("b")) { // condition to display account balance
                System.out.print("\n");
                printIndentedWithTwoSpaces("Account balance: ");
                System.out.printf("$%,6.2f", account.getBalance());
                System.out.print("\n\n");
            } else { // condition to handle invalid option
                System.out.print("\n");
                printIndentedWithTwoSpaces("Error: Invalid Option\n\n");
            }
            do { // do while loop to provide user option to continue with more operation
                printIndentedWithTwoSpaces("Continue? (y/n): ");
                continueOption = scanner.next();
                if (continueOption.equalsIgnoreCase("y") || continueOption.equalsIgnoreCase("n"))
                    validContinueOption = true;
                else
                    printIndentedWithTwoSpaces("Error: Invalid Option\n\n"); // condition to handle
                                                                             // invalid option
            } while (validContinueOption == false);
        } while (continueOption.equalsIgnoreCase("y"));
        System.out.print("\n\n");
        System.out.print(customer);
        System.out.print("\n\n");
        printIndentedWithTwoSpaces(
                "Balance as of " + account.getTransactionDate() + " is "); // Display the current date in a specific
                                                                           // format
        System.out.printf("$%,6.2f", account.getBalance()); // Display the balance in a specific format
        System.out.print("\n\n");
        printIndentedWithTwoSpaces("End of line...");
        scanner.close();

    } // end main

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
