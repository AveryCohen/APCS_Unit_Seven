import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TraversingArrayLists_Tests {

///*
    @Test
    @Order(1)
    public void getStatesTest() throws FileNotFoundException {
        System.setIn(new FileInputStream("files/states.txt"));
        ArrayList<String> actual = TraversingArrayLists.getStates();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Rhode Island");
        expected.add("Maryland");
        expected.add("Virginia");
        expected.add("Confusion");
        expected.add("Being");
        expected.add("New Hampshire");
        expected.add("Ohio");
        expected.add("Colorado");
        expected.add("California");
        assertEquals(expected, actual);

    }


    @Test
    @Order(2)
    public void stateListTest() {
        ArrayList<String> states = new ArrayList<>();
        states.add("Rhode Island");
        states.add("Maryland");
        states.add("Virginia");
        states.add("Confusion");
        states.add("Being");
        String expected = "Rhode Island -> Maryland -> Virginia -> Confusion -> Being";
        String actual = TraversingArrayLists.createList(states);
        assertEquals(expected, actual);
    }

//     */


    @Test
    @Order(3)
    public void largestSmallestTest() throws FileNotFoundException{
        Scanner input = new Scanner(new File("files/numbers2.txt"));
        ArrayList<Integer> expected = new ArrayList<>();
        while (input.hasNext()) {
            expected.add(input.nextInt());
        }
        ArrayList<Integer> actual = TraversingArrayLists.largestAndSmallest("files/numbers.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void largestSmallestTestReverse() throws FileNotFoundException{
        Scanner input = new Scanner(new File("files/numbers2.txt"));
        ArrayList<Integer> expected = new ArrayList<>();
        while (input.hasNext()) {
            expected.add(input.nextInt());
        }
        ArrayList<Integer> actual = TraversingArrayLists.largestAndSmallest("files/numbers3.txt");
        assertEquals(expected, actual);
    }






}
