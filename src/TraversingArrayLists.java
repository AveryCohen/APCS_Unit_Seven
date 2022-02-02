import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {
    public static ArrayList<String> getStates() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> stateList = new ArrayList<String>();
        System.out.print("Enter the name of a state or \"Stop\" to quit: ");
        String state = scan.nextLine();
        stateList.add(state);
        while (!(state.equals("Stop"))) {
            System.out.print("Next state or \"Stop\": ");
            state = scan.nextLine();
            stateList.add(state);
        }
        stateList.remove(stateList.size() - 1);
        return stateList;
    }


    public static String createList(ArrayList<String> states) {

        String list = states.get(0);
        for (int i=1; i < states.size(); i++) {
            list += " -> " + states.get(i);
        }
        return list;
    }


    // Please write the two methods for listOfStates in the space below. Uncomment the tests
    // when you are ready to run them.


    public static ArrayList<Integer> largestAndSmallest(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        // Your code should go below here, and above the return statement.


        return list;
    }







}
