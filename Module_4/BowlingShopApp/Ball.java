/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_4.BowlingShopApp;

public class Ball extends Product{

    //private fields for the class
    private String color ="";

    //No Argument Constructor   
    public Ball(){

    }

    //Getters and Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Overridden toString method with the custom description along with parent class
    @Override
    public String toString(){
        return super.toString()+"\n  Color: "+color+"\n";
    }
    

}
