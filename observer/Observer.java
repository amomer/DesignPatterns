import java.util.HashMap;

/**
 * Determines what methods have to be used by observers
 * @author Amjad Omer
 */
public interface Observer {
    /**
     * update method updates the hashmap when changes need to be made
     * @param votes takes in a string and its corresponding integer to be updated
     */
    public void update(HashMap<String,Integer> votes);
}
