import java.util.HashMap;

/**
 * Class that displays the tally of votes
 * @author Amjad Omer
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String,Integer> votes;
/**
 * initializes the hashmap and subject
 * @param poll
 */
    public TallyDisplay(Subject poll){
        poll.registerObserver(this);
        votes = new HashMap<String,Integer>();
    }
/**
 * updates the hashmap and leads to the display method
 * @param votes
 */
    public void update(HashMap<String,Integer> votes){
        
        display();
    }
/**
 * Displays the results
 */
    private void display(){
        System.out.println("Current Tallies:\n" + poll );
    
    }
}
