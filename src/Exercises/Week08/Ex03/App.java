package Exercises.Week08.Ex03;

import java.util.List;

public class App {
    public static void main(String[] args) {
        KeywordFinder keywordFinder = new KeywordFinder();
        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> elegent = keywordFinder.findElegent(sentence);
        System.out.println(elegent);
    }
}
