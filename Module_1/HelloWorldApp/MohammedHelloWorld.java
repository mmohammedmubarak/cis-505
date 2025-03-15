package Module_1.HelloWorldApp;

public class MohammedHelloWorld {
    public static void main(String[] args) {
        String firstName = "Abbas"; // Assigning value to firstName
        String lastName = "Mohammed"; // Assigning value to lastName
        helloWorld(firstName, lastName); // Make a call to helloWorld() method with the values assigned to the variables
                                         // firstName and lastName
    } // end main

    /**
     * Method taking two arguments and prints Hello World with the first and last
     * name
     * 
     * @param firstName String
     * @param lastName  String
     * @return prints the first and last name prefixed with "Hello World from" text
     *         in the console
     */
    
    public static void helloWorld(String firstName, String lastName) {
        System.out.printf("Hello World from " + firstName + " " + lastName);
    } // end helloWorld

} // end MohammedHelloWorld