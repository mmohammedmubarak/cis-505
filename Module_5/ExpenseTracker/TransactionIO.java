/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_5.ExpenseTracker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {

    private static final String FILE_NAME = "Module_5\\ExpenseTracker\\expenses.txt";
    private static File file = new File(FILE_NAME);
    private static PrintWriter output = null;
    private static boolean bulkInsert = false;

    /**
     * Method to insert transactions to the expenses file
     * @param transactions
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {

        if (file.exists()) {
            output = new PrintWriter(new java.io.PrintStream(FILE_NAME));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions) {
            output.print(tran.getDate() + ",");
            output.print(tran.getDescription() + ",");
            output.println(tran.getAmount());
        }
        bulkInsert = true;
        output.close();
    } // end bulkInsert

    /**
     * Method to return all the transaction from expenses file
     * @return transactions list
     * @throws IOException
     */
    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();
        if (!bulkInsert) {
            return null;
        }

        File file = new File(FILE_NAME);
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] fileData = line.split(","); 
            Transaction transaction = new Transaction();
            transaction.setDate(fileData[0]);
            transaction.setDescription(fileData[1]);
            transaction.setAmount(Double.parseDouble(fileData[2]));
            transactions.add(transaction);
        }
        input.close();

        return transactions;
    } // end FindAll

}
