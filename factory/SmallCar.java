package factory;

import java.util.ArrayList;
/**
 * @author Amjad Omer
 * class to make a small car
 */
public class SmallCar extends Car{
    /**
     * calls the make and model from the constructor
     * @param make
     * @param model
     */
    public SmallCar(String make, String model){
        super(make, model);
    }
    /**
     * displays the kind of frame being added
     */
    protected void addFrame(){
        System.out.println("Adding a small frame");
    }
    /**
     * adds and displays the corresponding accessories
     */
    protected void addAccessories(){
        System.out.println("Accessories: ");
        accessories = new ArrayList<Accessories>();
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        displayAccessories();
    } 
}
