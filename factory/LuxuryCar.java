package factory;

import java.util.ArrayList;
/**
 * @author Amjad Omer
 * enumeration of all the possible accessory options for a car
 */
public class LuxuryCar extends Car{
    /**
     * calls the make and model from the constructor
     * @param make
     * @param model
     */
    public LuxuryCar(String make, String model){
        super(make, model);
    }
    /**
     * displays the kind of frame being added
     */
    protected void addFrame(){
        System.out.println("Adding a beautiful frame");
    }
    /**
     * overrides the original engine prompt to display that this engine is supped up
     */
    @Override
    protected void addEngine(){
        System.out.println("Adding a Supped Up Engine");
    }
    /**
     * adds and displays the corresponding accessories
     */
    protected void addAccessories(){
        accessories = new ArrayList<Accessories>();
        System.out.println("Accessories: ");
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
        displayAccessories();
    }
}
