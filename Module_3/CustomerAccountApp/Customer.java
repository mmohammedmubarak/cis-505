/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_3.CustomerAccountApp;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    // Accessor methods for the data fields
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public Customer() {

    }

    /**
     * Argument Constructor to create customer object with the input arguments
     * 
     * @param name
     * @param address
     * @param city
     * @param zip
     */
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    /*
     * Overridden toString method to print customer details
     * 
     * @return customer details
     */
    public String toString() {
        return "  --Customer Details--\n  Name: " + name + "\n  Address: " + address + "\n  City: " + city + "\n  Zip: "
                + zip;

    }

}
