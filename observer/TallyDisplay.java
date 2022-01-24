import java.util.HashMap;

/**
 * 
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String,Integer> votes;
    
    public TallyDisplay(Subject poll){
        poll.registerObserver(this);
        votes = new HashMap<String,Integer>();
    }

    public void update(HashMap<String,Integer> votes){
        
        display();
    }

    private void display(){
        System.out.println("Current tallies:\n" + votes);
    
    }
}
