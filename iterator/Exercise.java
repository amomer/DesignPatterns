package iterator;

import java.util.ArrayList;
/**
 * @author Amjad Omer
 * class to add exercises
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles = new ArrayList<String>();
    private ArrayList<String> directions = new ArrayList<String>();
    /**
     * constructor for title
     * @param title of exercise
     */
    public Exercise(String title){
        this.title = title;
    }
    /**
     * constructor for arraylists and title
     * @param title of exercise
     * @param targetMuscles for exercise
     * @param directions on doing the exercise
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }
    /**
     * adds muscle to target muscle arraylist
     * @param muscle being added to arraylist
     */
    public void addTargetMuscle(String muscle){
        targetMuscles.add(muscle);
    }
    /**
     * removes muscle from target muscle arraylist
     * @param muscle being removed from arraylist
     */
    public void removeTargetMuscle(String muscle){
        targetMuscles.remove(muscle);
    }
    /**
     * changes target muscles to a comma separated list
     * changes directions to a hyphenated list
     * @return the title of the workout, comma separated list of targeted muscles, and hyphenated list of directions for the workout
     */
    public String toString(){
        String musclesDisplay = String.join(", ", targetMuscles);
        String directionsDisplay = String.join("\n-", directions);
        return "\n... " + title + " ...\nMuscles: " + musclesDisplay + "\nExercises:\n-" + directionsDisplay + "\n";
    }
}
