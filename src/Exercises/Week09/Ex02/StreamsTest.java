package Exercises.Week09.Ex02;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    private FileReader fileReader = new FileReader();
    private List<String> getNames = fileReader.asList("Exercises/Week09/Ex02/names.txt");


    @Test
    void testShorterThanFour() {
        List<String> actual = getNames.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("El");

        Assertions.assertEquals(actual, expected);


    }

    @Test
    void testNamesEndwithM() {
        List<String> actual = getNames.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void containEandR() {
        List<String> actual = getNames.stream()
                .filter(e -> e.contains("e") && e.contains("r"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void manupilate (){
        List<String> actual = getNames.stream()

                .filter(e->e.length()==4)
                .map((e->e.toLowerCase()))
                .filter(e->e.contains("a")&& e.contains("m"))
                .map(e->e.replace("a","aa"))
                .collect(Collectors.toList());
        List<String>expected= Arrays.asList("maarj", "aamin", "omaar");

        Assertions.assertEquals(actual,expected);

    }

}
