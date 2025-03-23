/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_1.FanApp;

public class TestFanApp {
    public static void main(String[] args) {

        Fan fanUsingNoArgumentConstructor = new Fan(); // fan created using default no argument constructor
        Fan fanUsingArgumentConstructor = new Fan(Fan.SLOW, true, 5.0, "BLACK"); // fan created using argument constructor

        // Printing the fan created with default constructor
        System.out.println("----------------------------------");
        System.out.println("Fan created with default values");
        System.out.println(fanUsingNoArgumentConstructor); //

        // Printing the fan created with values passed in the argument constructor
        System.out.println("----------------------------------");
        System.out.println("Fan created by passing values to the argument constructor");
        System.out.println(fanUsingArgumentConstructor);
        
        System.out.println("----------------------------------");
    } // end main
} // end TestFanApp
