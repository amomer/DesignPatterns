package factory;
/**
 * @author Amjad Omer
 * class to make each kind of car
 */
public class CarFactory {
    /**
     * Determines the type of car, displays the make and model being created, and creates the car
     * @param type
     * @param make
     * @param model
     * @return car
     */
    public static Car createCar(String type, String make, String model){

        Car car = null;

        if(type.equals(CarType.small.name())) {
            System.out.println("Creating a " + make + " " + model);
            car = new SmallCar(make, model);
        }

        else if(type.equals(CarType.sedan.name())) {
            System.out.println("Creating a " + make + " " + model);
            car = new SedanCar(make, model);
        }

        else if(type.equals(CarType.luxury.name())) {
            System.out.println("Creating a " + make + " " + model);
            car = new LuxuryCar(make, model);
        }

        car.assemble();
        return car;
    }
}
