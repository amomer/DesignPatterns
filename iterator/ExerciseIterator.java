package iterator;

import java.util.Iterator;
/**
 * @author Amjad Omer
 * Exercise class iterator
 */
public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
    private int position;
    /**
     * constructor for exercises array
     * @param exercises array with exercises
     */
    public ExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
    }
    /**
     * @return true if there is a next position in the array, otherwise false
     */
    public boolean hasNext(){
        if(position >= exercises.length || exercises[position] == null){
            return false;
        }
        return true;
    }
    /**
     * @return the next position in the array if there is a next one, otherwise null
     */
    public Exercise next(){
        if(this.hasNext())
           return exercises[position++];
        return null;
    }
}
