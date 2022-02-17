import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void main(String[] args) throws FileNotFoundException {
        ScrabbleHelper scrabbleHax = new ScrabbleHelper();
        Scanner scan = new Scanner(System.in);
        ArrayList<String> matches = scrabbleHax.findMatches("boo");
        scrabbleHax.sortWords(matches);
        System.out.println(matches);
        String myTiles = "boobaai";
        System.out.println(scrabbleHax.possibleCombinations(myTiles));
        while (true) {
            System.out.print("Enter a word to test: ");
            String input = scan.nextLine();
            if (input.equals("")) {
                System.out.println("Goodbye!");
                break;
            }
            if (scrabbleHax.foundWord(input) == true) {
                System.out.println("\"" + input + "\"" + " is a word");
            }
            else if (scrabbleHax.foundWord(input) == false) {
                System.out.println("\"" + input + "\"" + " is not a word");
            }

        }
    }


}
