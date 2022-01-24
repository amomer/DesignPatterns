import java.util.ArrayList;
/**
 * Sorting of inputted lists via bubble or insertion sort
 * @author Amjad Omer
 */
public class Listing {
    protected String title;
    ArrayList<String> Temp = new ArrayList<String>();
    BubbleSort sortBehavior;

    /**
     * Sets the name of the listing
     * @param title of the current list
     */
    public Listing(String title) {
        this.title = title;
    }

    /**
     * 
     * @param item added to the list
     */
    public void add(String item) {
        Temp.add(item);
    }

    /**
     * 
     * @param item removed from the list
     */
    public void remove(String item) {
        Temp.remove(item);
    }

    /**
     * 
     * @return The title of the list
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * Sets the sort behavior to bubble sort by default
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        SortBehavior.sort(Temp);
    }

    /**
     * 
     * @return The sorted version of the inputted list
     */
    public ArrayList<String> getSortedList() {

        return SortBehavior.sort(Temp);
    }

    /**
     * 
     * @return The original version of the inputted list
     */
    public ArrayList<String> getUnsortedList() {
        return Temp;
    }
}
