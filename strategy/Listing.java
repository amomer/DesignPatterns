import java.util.ArrayList;

public class Listing {
    protected String title;
    ArrayList<String> Temp = new ArrayList<String>();
    BubbleSort sortBehavior;

    public Listing(String title) {
        this.title = title;
    }

    public void add(String item) {
        Temp.add(item);
    }

    public void remove(String item) {
        Temp.remove(item);
    }

    public String getTitle() {
        return title;
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        SortBehavior.sort(Temp);
    }

    public ArrayList<String> getSortedList() {

        return SortBehavior.sort(Temp);
    }

    public ArrayList<String> getUnsortedList() {
        return Temp;
    }
}
