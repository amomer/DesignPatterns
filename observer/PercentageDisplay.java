import java.util.HashMap;

/**
 * 
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String,Integer> votes;
    private int numVotes;

    public PercentageDisplay(Subject poll){
        poll.registerObserver(this);
        votes = new HashMap<String,Integer>();
        this.numVotes = 0;
    }

    public void update(HashMap<String,Integer> votes){
        
    }

    private void display(){

    }
}
