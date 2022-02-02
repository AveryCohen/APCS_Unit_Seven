import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlgorithms {

//    /*
    public static ArrayList<Integer> fileDuplicates(String file1, String file2) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File(file1));
        ArrayList<Integer> list1 = new ArrayList<>();
        while (input1.hasNext()) {
            list1.add(input1.nextInt());
        }
        Scanner input2 = new Scanner(new File(file2));
        ArrayList<Integer> list2 = new ArrayList<>();
        while (input2.hasNext()) {
            list2.add(input2.nextInt());
        }
        int counter = 0;
        ArrayList<Integer> dupes = new ArrayList<>();
        for (int i=0; i<list1.size(); i++) {
            for (int j=0; j<list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    if (counter == 0) {
                        dupes.add(list1.get(i));
                        counter++;
                    }
                    else if (counter > 0 && list1.get(i) != dupes.get(counter-1)) {
                        dupes.add(list1.get(i));
                        counter++;
                    }
                }
            }
        }
        return dupes;



    }

//     */
/*
    public static ArrayList<String> removeDuplicates(String filename)throws FileNotFoundException {

    }

 */
/*
    public static ArrayList<Integer> orderedList()throws FileNotFoundException {

    }

 */

}
