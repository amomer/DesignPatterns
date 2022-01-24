import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */
public class StudentGovPoll implements Subject{
    private ArrayList<Observer> observers;
    private HashMap<String,Integer> votes;
    private String school;
    private int numUpdates;

    public StudentGovPoll(String school){
        observers = new ArrayList<Observer>();
        votes = new HashMap<String,Integer>();
        this.school = school;
        this.numUpdates = 0;
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(votes);
        }
    }

    public void addCandidate(String president){
        votes.put(president, 0);
        numUpdates++;
        if(numUpdates == 4){
            numUpdates = 0;
            notifyObservers();
        }
    }
    
    public void enterVotes(String president, int num){
        votes.put(president, votes.get(president)+num);
        numUpdates++;
        if(numUpdates == 4){
            numUpdates = 0;
            notifyObservers();
        }
    }

    public String getSchool(){
        return school;
    }
    
}
