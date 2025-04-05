/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_4.BowlingShopApp;

public class Bag extends Product{

    //private fields for the class
    private String type = "";

    //No Argument Constructor
    public Bag(){

    }

    //Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    // Overridden toString method with the custom description along with parent class
    @Override
    public String toString(){
        return super.toString()+"\n  Type: "+type+"\n";
    }
}
