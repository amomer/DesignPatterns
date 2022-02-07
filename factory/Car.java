package factory;

import java.util.ArrayList;
/**
 * @author Amjad Omer
 * abstract base class for the cars
 */
public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories;
    /**
     * initializes the make and model
     * @param make
     * @param model
     */
    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }
    /**
     * puts each part of the car together to display
     */
    public void assemble(){
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
    }

    /**
     * abstract method to display the frame info
     */
    protected abstract void addFrame();

    /**
     * Displays that the wheels are being added
     */
    protected void addWheels(){
        System.out.println("Adding the wheels");
    }
    /**
     * Displays what kind of engine is being added
     */
    protected void addEngine(){
        System.out.println("Adding a Standard Engine");
    }
    /**
     * displays that windows are being added
     */
    protected void addWindows(){
        System.out.println("Adding Windows");
    }
    /**
     * abstract method for adding accessories
     */
    protected abstract void addAccessories();
    /**
     * displays, as a hyphen list, all of the added accessories to the arraylist
     */
    protected void displayAccessories(){
        /**
         * Using https://www.tutorialkart.com/java/how-to-print-all-elements-of-an-arraylist-in-java/
         */
        accessories.forEach(accessory ->{
            System.out.println("- " + accessory);
        });
    }
}

