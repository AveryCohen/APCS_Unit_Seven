import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {
    private ArrayList<String> wordList;

    public ScrabbleHelper() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("files/enable.txt"));
        wordList = new ArrayList<>();
        while (scan.hasNext()) {
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
        for (String a : wordList) {
            if (a.indexOf(pattern) != -1) {
                matches.add(a);
            }
        }
        return matches;
    }

    public void sortWords(ArrayList<String> matches) {
        for (int j = 1; j < matches.size(); j++) {
            String tempS = matches.get(j);
            int temp = matches.get(j).length();
            int i = j - 1;
            while ((i >= 0) && temp < matches.get(i).length()) {
                matches.set(i + 1, matches.get(i));
                i--;
            }
            matches.set(i + 1, tempS);
        }
    }

    public ArrayList<String> possibleCombinations(String allTiles) {
        ArrayList<String> wordOptions = new ArrayList<>();
        for (String s : wordList) {
            ArrayList<Character> tiles = new ArrayList<>();
            int a = 0;
            int counter = a;
            boolean canMakeWord = true;
            for (int i = 0; i < allTiles.length(); i++) {
                tiles.add(allTiles.charAt(i));
            }
            for (int j = 0; j < s.length(); j++) {
                Character letter = s.charAt(j);
                if (tiles.contains(letter)) {
                    tiles.remove((Character) letter);
                } else {
                    a++;
                    break;
                }
            }
            if (counter == a) {
                wordOptions.add(s);
            }
        }
        return wordOptions;
    }

    public int getScores(String word) {
        int score = 0;
        int[] scores = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = letter - 'a';
            score += scores[index];
        }
        return score;
    }

    public void sortByScores(ArrayList<String> possibleWords) {
        for (int i = 0; i < possibleWords.size() - 2; i++) {
            int largest = i;
            for (int j = i + 1; j < possibleWords.size(); j++) {
                if (getScores(possibleWords.get(j)) > getScores(possibleWords.get(largest)))
                    largest = j;
            }
            String temp = possibleWords.get(i);
            possibleWords.set(i, possibleWords.get(largest));
            possibleWords.set(largest, temp);
        }
    }
}



