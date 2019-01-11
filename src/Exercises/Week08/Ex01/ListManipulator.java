package Exercises.Week08.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManipulator {

    List<String> words = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table",
            "cable", "glass", "backpack", "mouse"));

    protected void filterWords(){
        words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);
    }
    protected void uppercaseWords(){
        words.replaceAll(word->(word.toUpperCase()));
        System.out.println(words);
    }
    protected void removeSelectedWord(){
        words.replaceAll(word -> word.toUpperCase());
        words.removeIf(word -> word.equals("GLASS"));
        System.out.println(words);
    }
    protected void removeSelectedWordAgain(){
        words.forEach(word -> System.out.println(word.toUpperCase()));
    }

}