package Exercises.Week10;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreStreams {

        public static void main(String[] args) {
            String quote = "If you want to find the secrets of the universe, think in terms of energy, frequency and vibration.";

            // group by counting
            // group by toList
            // count
            // reduce
            // flatMap
            // noneMatch
            // anyMatch
            // allMatch

            // collect to words
            List<String> words = Stream.of(quote.split(" "))
                    .map(e -> e.replaceAll(",", ""))
                    .map(e -> e.replaceAll("\\.", ""))
                    .collect(Collectors.toList());
            System.out.println("Words: " + words);

            // count how many times each word appears
            System.out.println("How many times each word appears:");
            Map<String, Long> wordAppearances = words.stream()
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            System.out.println(wordAppearances);

            System.out.println("Which word appears the most:");
            Optional<String> mostAppeared = wordAppearances.entrySet().stream()
                    //entrySet because it is a Map
                    .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                    .map(e -> e.getKey() + " appears " + e.getValue() + " times")
                    .findFirst();
            if (mostAppeared.isPresent()) {
                //because it is Optional "So we use isPresent
                System.out.println("Most appearing word: " + mostAppeared.get());
            }


            // find out the most appearing three letters
            List<String> mostAppearingThreeLetters = words.stream()
                    .map(word -> word.split(""))
                    .flatMap(e -> Stream.of(e))
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                    .entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(3)
                    .map(e -> e.getKey() + " | " + e.getValue())
                    .collect(Collectors.toList());
            System.out.println("Most appearing three letters:");
            mostAppearingThreeLetters.forEach(e -> System.out.println(e));

            // check if there are at least words with more than 6 and 7 letters
            boolean isThereOneWordWithLength = words.stream()
                    .map(word -> word.length())
                    .anyMatch(length -> length > 7);
            System.out.println("Any Match: " + isThereOneWordWithLength);

            // group words by word length
            Map<Integer, List<String>> wordLengths = words.stream()
                    .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));
            System.out.println("Word lengths:");
            wordLengths.entrySet().stream()
                    .sorted((e2, e1) -> e1.getKey().compareTo(e2.getKey()))
                    .map(e -> e.getKey() + " | " + e.getValue())
                    .forEach(e -> System.out.println(e));


            // check if all words at least have more than 3 and 2 letters
            boolean allWordsHaveAtLeastNLetters = words.stream()
                    .allMatch(word -> word.length() >= 3);
            System.out.println("All words have at least 3 letters: " + allWordsHaveAtLeastNLetters);

            // count the total sum of all ascii codes (uses flat map)
            Integer totalAsciiCodes = words.stream()
                    .map(e -> e.split(""))
                    .flatMap(e -> Stream.of(e))
                    .map(letter -> (int) letter.charAt(0))
                    .reduce(0, (e1, e2) -> e1 + e2);
            System.out.println("Sum of all ascii codes: " + totalAsciiCodes);


            // count how many words with at least two e's and peek them
            long wordsWithTwoEs = words.stream()
                    .filter(hasAtLeastTwoEs())
                    .count();
            System.out.println("Number of words that have at least 2 e's:" + wordsWithTwoEs);

            System.out.println("Words that have double e's: ");
            words.stream()
                    .filter(hasAtLeastTwoEs())
                    .forEach(word -> System.out.println(word));

        }

        private static Predicate<String> hasAtLeastTwoEs() {
            return word -> Stream.of(word.split(""))
                    .filter(letter -> letter.equalsIgnoreCase("e"))
                    .count() >= 2;
        }

    }




