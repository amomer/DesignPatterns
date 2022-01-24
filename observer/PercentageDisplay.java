import java.util.HashMap;

/**
 * Class that displays the percentage of votes
 * @author Amjad Omer
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String,Integer> votes;
    private int numVotes;
/**
 * initializes the hashmap, subject, and number of votes
 * @param poll
 */
    public PercentageDisplay(Subject poll){
        poll.registerObserver(this);
        votes = new HashMap<String,Integer>();
        this.numVotes = 0;
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
        System.out.println("Current Percent of Votes:\n" + votes);
    }
}
