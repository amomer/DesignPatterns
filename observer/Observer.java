import java.util.HashMap;

/**
 * Determines what methods have to be used by observers
 * @author Amjad Omer
 */
public interface Observer {
    public void update(HashMap<String,Integer> votes);
}
