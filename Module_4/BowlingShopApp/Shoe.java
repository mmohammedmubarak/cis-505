/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_4.BowlingShopApp;

public class Shoe extends Product {

    //private fields for the class
    private double size = 0.0;

    //No Argument Constructor
    public Shoe(){

    }
    
    //Getters and Setters
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    
    // Overridden toString method with the custom description along with parent class
    public String toString(){
        return super.toString()+"\n  Size: "+size+"\n";
    }

}
