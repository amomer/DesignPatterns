package iterator;

import java.util.ArrayList;
/**
 * @author Amjad Omer
 * class for PT info and exercise array
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises = new Exercise[2];
    private int numExercises;
    /**
     * constructor for name and bio
     * @param firstName of pt
     * @param lastName of pt
     * @param bio of pt
     */
    public PT(String firstName, String lastName, String bio){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }
    /**
     * checks if array needs to be expanded, adds the exercise after it is sized properly
     * @param title of workout
     * @param muscleGroups being worked in workout
     * @param directions on how to do workout
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions){
        Exercise exercise = new Exercise(title, muscleGroups, directions);
		if(numExercises == exercises.length){
            exercises = growArray(exercises);
        }
        exercises[numExercises] = exercise;
        numExercises = numExercises + 1;
    }
    /**
     * @return first name of pt
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * @return last name of pt
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * @return bio of pt
     */
    public String getBio(){
        return bio;
    }
    /**
     * doubles the size of the array
     * @param exercises array holding exercises
     * @return expanded array
     */
    private Exercise[] growArray(Exercise[] exercises){
        Exercise[] in = new Exercise[exercises.length+2];
        for(int i = 0; i < exercises.length; i++){
            in[i] = exercises[i];
        }
        return in;
    }
    /**
     * @return a new instance of an iterator
     */
    public ExerciseIterator createIterator(){
        return new ExerciseIterator(exercises);
    }
    /**
     * @return the name and bio of the pt
     */
    public String toString(){
        return firstName + " " + lastName + "\n" + bio + "\n";
    }
}
