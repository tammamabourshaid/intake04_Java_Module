package Exercises.Week08.Ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> findElegent(String sentence) {


        return finder(sentence, s->s.startsWith("ele"));
    }

        public List<String> findPlayful(String sentence, Predicate<String> condition) {


        return finder(sentence, s->s.endsWith("ful"));
    }

    public List<String> finder(String sentence, Predicate<String> condition) {
        List<String> words = new ArrayList<>();
        String[] splittedSentence = sentence.split(" ");
        for (String word : splittedSentence) {
            if (condition.test(word)) {
                words.add(word);
            }
        }
        return words;
    }
}
