package Exercises.Week10.Ex03;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsApp {
    public static void main(String[] args) {
        sortedByHighestRatio();
        theMostWordUsedInHam();
        theMostLetterUsedInHam();
        theLongestSpamMessage();
    }

    private static List<SmsList> smsLists() {
        return new SmsFile().getSmsFile();
    }

    private static void sortedByHighestRatio() {
        String sortedByHighRatio = smsLists().stream()
                .collect(Collectors.groupingBy(SmsList::getValueOne, Collectors.counting()))
                .entrySet().stream()
                .sorted((e2, e1) -> e1.getValue().compareTo(e2.getValue()))
                .map(e -> e.getKey() + "  " + (e.getValue() * 100 / smsLists().size() + " %  "))
                .collect(Collectors.joining());
        System.out.println("Ham/spam ratio: \n" + sortedByHighRatio);


    }

    private static void theMostWordUsedInHam() {
        String theMostWordUsedInHam = smsLists().stream()
//                .filter(e -> e.getValueOne().equals("ham"))
                .map(e -> e.getValueTwo().split(" "))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> "\nMost used ham word: " + e.getKey())
                .collect(Collectors.joining());
        System.out.println(theMostWordUsedInHam);


    }

    private static void theMostLetterUsedInHam() {
        String theMostLetterUsed = smsLists().stream()
                .map(e -> e.getValueTwo().replaceAll(" ", "").split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> e.getKey())
                .collect(Collectors.joining());

        System.out.println("\nMost used ham letter: " + theMostLetterUsed);

    }

    private static void theLongestSpamMessage() {
        Integer longestSpamMessage = smsLists().stream()
                .skip(1)
                .filter(e -> e.getValueOne().contains("spam"))
                .map(e->e.getValueTwo().length())
                .sorted(Comparator.reverseOrder())
                .findFirst().get();


//                .sorted(Comparator.comparing(SmsList::getValueTwo).reversed())
//                .collect(Collectors.groupingBy(e -> e.getValueTwo().length()))
//                .entrySet().stream()
//                .map(e->e.getValue())
//                .count();


        System.out.println("\nLongest spam message: " + longestSpamMessage);


    }
}
