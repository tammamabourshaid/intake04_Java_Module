package Exercises.Week08.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FormatList {

    public void FilterWords() {
        List<String> words = Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse");
        System.out.println(words);

        List<String> modified = new ArrayList<>(words);
        Predicate<String> endsWithE = word -> word.endsWith("e");
        modified.removeIf(endsWithE);
        System.out.println(modified);

        modified.replaceAll(replace -> replace.toUpperCase());
        System.out.println(modified);

        modified.removeIf(size -> size.length() < 6);
        System.out.println(modified);

        modified.forEach(print-> System.out.println(print));
    }
}

