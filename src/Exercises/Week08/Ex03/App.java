package Exercises.Week08.Ex03;

import java.util.List;

public class App {
    public static void main(String[] args) {
        KeywordFinder keywordFinder = new KeywordFinder();
        String sentence1 = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> elegent = keywordFinder.findElegent(sentence1);
        String sentence2= "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> playful = keywordFinder.findPlayful(sentence2);
        System.out.println(sentence1);
        System.out.println(elegent);
        System.out.println(sentence2);
        System.out.println(playful);
    }
}
