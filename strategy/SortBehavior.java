import java.util.ArrayList;

public interface SortBehavior {
    public static ArrayList<String> sort(ArrayList<String> data) {
        BubbleSort.sort(data);
        return data;
    }
}
