package Exercises.Week10.Ex04;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterApp {
    private static List<ChractersList> chractersLists() {
        return new CharacterFile().getCharacterFile();

    }

    public static void main(String[] args) {
//How many characters appear in the books in total
        howManyCharactersAppearInTheBooksInTotal();

//        How many characters died?
        howManyCharacterDied();

//        Display the overall percentage of men and women that died in all books
        displayOverallPercentageOfMenWomenDiedinAllBooks();

//        Which book has the biggest death count with how many?

        whichBookTheBiggestDeathCountWithHowMany();

//        Who died in that book ?
        whoDiedInThatBook();
    }


    private static void howManyCharactersAppearInTheBooksInTotal() {
        long count = chractersLists().stream()
                .count();
        System.out.println("Number of characters: " + count);
    }


    private static void howManyCharacterDied() {
        long howManyDied = chractersLists().stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .map(e -> e.getBookOfDeath())
                .count();
        System.out.println("Number of dead characters: " + howManyDied);


    }

    private static void displayOverallPercentageOfMenWomenDiedinAllBooks() {
        long countMen = chractersLists().stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getGender().toString().contains("1"))
                .count();
        System.out.println("\nDead men: " + countMen);


        long countWomen = chractersLists().stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getGender().toString().contains("0"))
                .count();
        System.out.println("Dead women: " + countWomen);

        Long percentageM = 100 * (countMen) / (countMen + countWomen);
        System.out.println("\nDead men Percentage = " + percentageM + " %");

        Long percentageW = 100 * (countWomen) / (countMen + countWomen);
        System.out.println("Dead Women Percentage = " + percentageW + " %");

    }


    private static void whichBookTheBiggestDeathCountWithHowMany() {
        Map<String, Long> collect = chractersLists().stream()
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()));
        collect.entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "\nBook:" + e.getKey() + " | " + "Deaths:" + e.getValue())
                .findFirst().ifPresent(System.out::println);


    }

    private static void whoDiedInThatBook() {
        List<String> collect = chractersLists().stream()
                .collect(Collectors.groupingBy(e -> e.getName(), Collectors.counting()))
                .entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("\n" + collect);
    }
}






















































