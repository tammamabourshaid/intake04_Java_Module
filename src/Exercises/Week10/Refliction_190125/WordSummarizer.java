package Exercises.Week10.Refliction_190125;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordSummarizer {

    public long count(List<String> words) {
        return words.size();
    }

public long countDistinct(List<String> words){
        return words.stream()
                .distinct()
                .count();
}

    public List<String> getLongest(List<String> words) {
return words.stream()
        .collect(Collectors.groupingBy(e -> Integer.valueOf(e.length()), Collectors.toList()))
        .entrySet().stream()
        .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
        .limit(1)
        .map(Map.Entry::getValue)
        .flatMap(List::stream)
        .collect(Collectors.toList());
    }

    public List<String> get5MostAppearing(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e->e.getValue()+" | "+e.getKey())
                .collect(Collectors.toList());
    }

    public static List<String> get5MostAppearingLetters(List<String> words) {
        return words.stream()
                .map(e->e.split(""))
                .flatMap(e-> Stream.of(e))
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e->e.getValue()+" | "+e.getKey())
                .collect(Collectors.toList());
    }

    public long count(String word, List<String> words) {
        return words.stream()
                .filter(e->e.equalsIgnoreCase(word))
                .count();
    }
}
