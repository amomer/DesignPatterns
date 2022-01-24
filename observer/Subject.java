/**
 * Class that determines the observers
 * @author Amjad Omer
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
