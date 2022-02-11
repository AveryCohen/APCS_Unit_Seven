import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Merge {

//    /*
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        ArrayList<Integer> listMerge = new ArrayList<>();
        int i =0;
            while (i < listTwo.size() - 1) {
                if (listOne.get(i) > listTwo.get(i)) {
                    listMerge.add(listOne.get(i));
                    int j = 1;
                    while (listOne.get(j) > listTwo.get(i) && j < listOne.size() - 1) {
                        listMerge.add(listOne.get(j));
                        j++;
                    }
                } else if (listOne.get(i) < listTwo.get(i)) {
                    listMerge.add(listTwo.get(i));
                    int k = 1;
                    while (listOne.get(k) < listTwo.get(i) && k < listOne.size() - 1) {
                        listMerge.add(listTwo.get(k));
                        k++;
                    }
                } else {
                    listMerge.add(listOne.get(i));
                }
                i++;
            }

        return listMerge;
    }

//     */
}
