import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class that creates the student gov poll
 * @author Amjad Omer
 */
public class StudentGovPoll implements Subject{
    private ArrayList<Observer> observers;
    private HashMap<String,Integer> votes;
    private String school;
    private int numUpdates;
/**
 * Initializes the hashmap and arraylist as well as giving the school name and setting the number of updates to 0
 * @param school
 */
    public StudentGovPoll(String school){
        observers = new ArrayList<Observer>();
        votes = new HashMap<String,Integer>();
        this.school = school;
        this.numUpdates = 0;
    }
/**
 * registers an observer
 * @param observer
 */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
/**
 * removes an observer
 * @param observer
 */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
/**
 * notifies observers to update the hashmap with the votes
 */
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(votes);
        }
    }
/**
 * adds a candidates name as a key to the hashmap and initializes their vote count to 0, checks for the 4th update
 * @param president
 */
    public void addCandidate(String president){
        votes.put(president, 0);
        numUpdates++;
        if(numUpdates == 4){
            numUpdates = 0;
            notifyObservers();
        }
    }
/**
 * adds a number of votes to the value of a candidates corresponding key, checks for the 4th update
 * @param president
 * @param num
 */
    public void enterVotes(String president, int num){
        votes.put(president, votes.get(president)+num);
        numUpdates++;
        if(numUpdates == 4){
            numUpdates = 0;
            notifyObservers();
        }
    }
/**
 * gets the name 
 * @return school name
 */
    public String getSchool(){
        return school;
    }
    
}
