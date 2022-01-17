import java.util.ArrayList;

public class InsertionSort implements SortBehavior {
    public static ArrayList<String> sort(ArrayList<String> data) {
        for(int i = 0; i < data.size()-1; i++){
            String temp = data.get(i);
            for(int j = i+1; j<data.size()-1;j++){
                if(temp.compareToIgnoreCase(data.get(j)) > 0){
                    data.set(i,data.get(j));
                    data.set(j,temp);
                }
            }
        }
        return data;
        
    }
}
