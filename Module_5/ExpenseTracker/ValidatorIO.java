/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_5.ExpenseTracker;

import java.util.Scanner;

public class ValidatorIO {

    /**
     * Method to validate integer input
     * @param sc
     * @param prompt
     * @return
     */
    public static int getInt(Scanner sc, String prompt){
        int input = 0;
        boolean isValid = false;

        while(!isValid){
            System.out.print(prompt);
            if(sc.hasNextInt()){
                input = sc.nextInt();
                isValid = true;
            }
            else{
                System.out.println("\n  Error! Invalid Integer Value.\n");
            }
            sc.nextLine();
        }
        return input;
    } // end getInt

    /**
     * Method to validate double input
     * @param sc
     * @param prompt
     * @return
     */
    public static double getDouble(Scanner sc, String prompt){
        double input = 0;
        boolean isValid = false;

        while(!isValid){
            System.out.print(prompt);
            if(sc.hasNextDouble()){
                input = sc.nextDouble();
                isValid = true;
            }
            else{
                System.out.println("\n  Error! Invalid Double Value.\n");
            }
            sc.nextLine();
        }
        return input;        
    } // end double

    /**
     * Method to validate string input
     * @param sc
     * @param prompt
     * @return
     */
    public static String getString(Scanner sc, String prompt){
        String input = "";
        boolean isValid = false;

        while(!isValid){
            System.out.print(prompt);
            if(sc.hasNext()){
                input = sc.next();
                isValid = true;
            }
            else{
                System.out.println("\n  Error! Invalid String Value.\n");
            }
            sc.nextLine();
        }
        return input;
    } // end getString

}
