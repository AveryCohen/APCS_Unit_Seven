import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void main(String[] args) throws FileNotFoundException {
        ScrabbleHelper scrabbleHax = new ScrabbleHelper();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word to test: ");
            String input = scan.next();
            if (input.equals("")) {
                break;
            }
            if (scrabbleHax.foundWord(input) == true) {

            }

        }
    }


}
