package factory;

import java.util.ArrayList;
/**
 * @author Amjad Omer
 * enumeration of all the possible accessory options for a car
 */
public class SedanCar extends Car{
    /**
     * calls the make and model from the constructor
     * @param make
     * @param model
     */
    public SedanCar(String make, String model){
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
        accessories = new ArrayList<Accessories>();
        System.out.println("Accessories: ");
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        displayAccessories();
    }
}
