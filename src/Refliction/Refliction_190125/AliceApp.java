package Refliction.Refliction_190125;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceApp {


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        Stream<String> alice = fileReader.asStream("Refliction/Refliction_190125/alice.txt");


        List<String> collect = alice
                .map(e -> e.replaceAll(",", ""))
                .map(e -> e.replaceAll(";", ""))
                .map(e -> e.replaceAll("’s", ""))
                .map(e -> e.replaceAll("’", ""))
                .map(e -> e.replaceAll("‘", ""))
                .map(e -> e.replaceAll(":", ""))
                .map(e -> e.replaceAll("#", ""))
                .map(e -> e.replaceAll("/", ""))
                .map(e -> e.replaceAll("-", ""))
                .map(e -> e.replaceAll("\\.", ""))
                .map(e -> e.replaceAll("\\*", ""))
                .map(e -> e.replaceAll("\\(", ""))
                .map(e -> e.replaceAll("\\)", ""))
                .map(e -> e.replaceAll("\\[", ""))
                .map(e -> e.replaceAll("]", ""))
                .collect(Collectors.toList());


        List<String[]> aliceFile = collect.stream()
                .map(e -> e.split(" "))
                .collect(Collectors.toList());

        long count = aliceFile.stream()
                .count();
        System.out.println("\nHow many words are in the book?\n" + count);


        long HowManyDistinct = collect.stream()
                .distinct()
                .count();
        System.out.println("\nHow many distinct words are in the book?\n" + HowManyDistinct);


        Map<String[], Long> collect1 = aliceFile.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        Optional<Map.Entry<String[], Long>> belongToLongestWord = collect1.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();

        if (belongToLongestWord.isPresent()) {
            System.out.println("\nWhich words belong to the group of the longest words?\n: " + belongToLongestWord.get());


            System.out.println("\nthe most appearing 5 words :");
            aliceFile.stream()
                    .flatMap(e -> Stream.of(e))
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                    .entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(5)
                    .map(e -> e.getKey() + " | " + e.getValue())
                    .forEach(e -> System.out.println(e));


            System.out.println("\nthe most appearing 5 Letters :");
            collect1.entrySet().stream()
                    .flatMap(e -> Stream.of(e))
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                    .entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(5)
                    .map(e -> e.getKey() + " | " + e.getValue())
                    .forEach(e -> System.out.println(e));


        }


    }

}

