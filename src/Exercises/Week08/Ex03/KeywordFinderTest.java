package Exercises.Week08.Ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class KeywordFinderTest {
    private KeywordFinder keywordFinder = new KeywordFinder();

    @Test
    void findElegent() {
        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";

        List<String> actual = keywordFinder.finder(sentence, s -> s.startsWith("ele"));
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findPlayful() {
        String sentence= "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> actual = keywordFinder.finder(sentence, s -> s.endsWith("ful"));
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        Assertions.assertEquals(expected,actual);
    }


}