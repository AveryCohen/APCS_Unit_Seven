import java.util.ArrayList;

public class AllSorts {
    private ArrayList<Integer> list;

    //selection sort
    public void selection() {
        for (int i=0; i<list.size()-2; i++) {
            int smallest = i;
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(j) < list.get(smallest))
                    smallest = j;
            }
            int temp = list.get(i);
            list.set(i, list.get(smallest));
            list.set(smallest, temp);
        }
    }
    //insertion sort
    public void insertion() {
        for (int j=1; j<list.size(); j++) {
            int temp = list.get(j);
            int i =j-1;
            while ((i>=0) && temp < list.get(i)) {
                list.set(i+1, list.get(i));
                i--;
            }
            list.set(i+1, temp);
        }
    }
}
