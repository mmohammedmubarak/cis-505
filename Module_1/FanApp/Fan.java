package Module_1.FanApp;

public class Fan {

    /**
     * Constants to capture the four speeds of the fan
     */   
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

     /**
     * Data fields to specify the speed, status, radius and color of the fan
     * Default values are assigned using the default No Argument  constructor
     */      
    private int speed;
    private boolean fanStatus;
    private double radius;
    private String color;

    /**
     * No Argument Constructor for Fan class to initialize default values to the object
     */
    public Fan() {
        this.speed = Fan.STOPPED;
        this.fanStatus = false;
        this.radius = 6;
        this.color = "White";
    }

    /**
     * Argument Constructor for Fan class to pass values to the object during
     * initialization
     */
    public Fan(int speed, boolean fanStatus, double radius, String color) {
        this.speed = speed;
        this.fanStatus = fanStatus;
        this.radius = radius;
        this.color = color;
    }

    /**
     * Overridden the toString method to display color, radius of the fan and speed
     * (when it is turned on)
     */
    @Override
    public String toString() {
        if (!fanStatus)
            return "The fan is " + color + " with a radius of " + radius + " and the fan is off";
        else
            return "The fan speed is set to " + speed + " with a color of " + color + " and a radius of " + radius;
    }

    /**
     * Accessor and mutator methods for the data fields speed, fanStatus, radius and
     * color
     */
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getFanStatus() {
        return fanStatus;
    }

    public void setFanStatus(boolean fanStatus) {
        this.fanStatus = fanStatus;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}// end Fan
