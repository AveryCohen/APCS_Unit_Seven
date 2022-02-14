import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {
    private ArrayList<String> wordList;

    public ScrabbleHelper() throws FileNotFoundException {
            Scanner scan = new Scanner(new File("files/enable.txt"));
            wordList = new ArrayList<>();
            while (scan.hasNext())
            {
                String word = scan.next();
                wordList.add(word);
            }
            scan.close();
    }

    public ArrayList<String> getWordList() {
        return wordList;
    }

    public boolean foundWord(String word) {
        int min = 0;
        int max = wordList.size() - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (wordList.get(mid).equals(word))
                return true;
            else if (wordList.get(mid).compareToIgnoreCase(word) > 0)
                max = mid - 1;
            else
                min = mid + 1;
        }
        return false;
    }
    public ArrayList<String> findMatches(String pattern) {
        ArrayList<String> matches = new ArrayList<>();
        for (String a :wordList) {
            if (a.indexOf(pattern) != -1) {
                matches.add(a);
            }
        }
        return matches;
    }


}

