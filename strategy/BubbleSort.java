import java.util.ArrayList;

public class BubbleSort implements SortBehavior {
    public static ArrayList<String> sort(ArrayList<String> data) {
        String temp;
        String a;
        String b;
        for(int i = 0; i < data.size()-1; i++) {
                a = data.get(i);
                b = data.get(i+1);
                if (a.compareToIgnoreCase(b) > 0) {
                    temp = data.get(i);
                    data.set(i,b);
                    data.set(i+1,temp);
                }
            } 
        return data;
        
    }
}
