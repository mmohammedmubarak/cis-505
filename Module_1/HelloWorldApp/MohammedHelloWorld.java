package Module_1.HelloWorldApp;
public class MohammedHelloWorld {
    /**
     * @param args
     */
    public static void main(String args[]) {
        String firstName = "Abbas"; // Assigning value to firstName
        String lastName = "Mohammed"; // Assigning value to lastName
        helloWorld(firstName, lastName); // Make a call to helloWorld() method with the values stored in the variables firstName and lastName
    } // end main

    /**
     * Method taking two arguments and prints the Hello World phrase with the first and last name
     * @param firstName String
     * @param lastName String
     * @return prints the first and last name prefixed with "Hello World from" text in the console
     */
    public static void helloWorld(String firstName, String lastName) {
        System.out.printf("Hello World from " + firstName + " " + lastName);
    }

}