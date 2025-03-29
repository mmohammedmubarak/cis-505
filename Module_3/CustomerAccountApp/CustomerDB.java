/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_3.CustomerAccountApp;

public class CustomerDB {
    /**
     * Method to return Customer object based on the customer id passed in the
     * argument
     * 
     * @param id
     * @return Customer object
     */
    public static Customer getCustomer(int id) {
        if (id == 1007) {
            return new Customer("Jennifer Patterson", "8422 Grover Ave.", "Bellevue", "68123");
        } else if (id == 1008) {
            return new Customer("Brad Pitt", "1008 Wolf Rd", "Chicago", "61008");
        } else if (id == 1009) {
            return new Customer("Leo DiCaprio", "1009 Main St", "Dallas", "61009");
        } else {
            return new Customer();
        }
    }
}
