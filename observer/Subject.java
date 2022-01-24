/**
 * Class that determines the observers
 * @author Amjad Omer
 */
public interface Subject {
    /**
     * @param observer the observer list
     * 
     */
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
