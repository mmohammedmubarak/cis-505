/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_8.EnhancedFutureValueApp;

public class FinanceCalculator {
    private static int MONTHS_IN_YEAR = 12;

    /**
     * Method to calculate and return future value based on monthly payment, rate and years
     * @param monthlyPayment
     * @param rate
     * @param years
     * @return Future value
     */
    static double calculateFutureValue (double monthlyPayment, double rate, int years){
        int totalMonths = years*MONTHS_IN_YEAR;
        double interestRate = (1+rate/100);
        double presentValue = monthlyPayment*totalMonths;
        double futureValue = presentValue*(Math.pow(interestRate,totalMonths));
        return futureValue;
    }
}
