/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_5.ExpenseTracker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {

    /**
     * Static Method to display the menu options
     */
    public static String displayMenu() {
        return "  MENU OPTIONS\n    1. View Transactions\n    2. Add Transactions\n    3. View Expense\n\n  Please choose an option: ";
    } // end displayMenu

    public static void main(String[] args) {
        System.out.println("  Welcome to the Expense Tracker");
        String continueExecution = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n");
            int input = ValidatorIO.getInt(sc, displayMenu()); // validate and display menu

            if (input == 1) {
                ArrayList<Transaction> transactions = null;
                try {
                    transactions = TransactionIO.findAll();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("\n");
                System.out.print("  MONTHLY EXPENSES");
                try {
                    for (Transaction tran : transactions) {
                        System.out.print("\n\n");
                        tran.toString();
                    }
                } catch (NullPointerException e) {
                    System.out.print("\n  No transactions added!");
                }

            } else if (input == 2) {
                // Scanner sc = new Scanner(System.in);
                ArrayList<Transaction> transactions = new ArrayList<>();
                String anotherTransaction;
                do {
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");
                    // System.out.println("Enter the amount: ");
                    Transaction transaction = new Transaction(description, amount);
                    transactions.add(transaction);

                    // transaction.setDescription(sc.nextLine());
                    // System.out.println("Enter the amount: ");
                    // transaction.setAmount(Double.parseDouble(sc.nextLine()));
                    anotherTransaction = ValidatorIO.getString(sc, "\n  Add another transaction? <y/n>: ");
                    // System.out.println("Add another transaction? <y/n>: ");
                } while (anotherTransaction.equalsIgnoreCase("y"));
                try {
                    TransactionIO.bulkInsert(transactions);
                } catch (IOException e) {
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            } else if (input == 3) {
                ArrayList<Transaction> transactions = null;
                try {
                    transactions = TransactionIO.findAll();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                double monthlyExpense = 0.0;
                try {
                    for (Transaction tran : transactions) {
                        monthlyExpense += tran.getAmount();
                    }
                    System.out.print("\n");
                    System.out.printf("  Your total monthly expense is  $%,6.2f", monthlyExpense);
                } catch (NullPointerException e) {
                    System.out.print("\n  No transactions added!");
                }
            } else {
                System.out.print("\n  Invalid option entered!");
            }

            System.out.print("\n\n");
            System.out.print("  Continue? (y/n): ");
            continueExecution = sc.nextLine();
            if (!continueExecution.equalsIgnoreCase("y") && !continueExecution.equalsIgnoreCase("n")) {
                System.out.print("\n  Invalid option entered!");
                System.out.print("\n");
            }
        } while (continueExecution.equalsIgnoreCase("y"));
        System.out.print("\n  Program terminated by the user...");
    }
}
