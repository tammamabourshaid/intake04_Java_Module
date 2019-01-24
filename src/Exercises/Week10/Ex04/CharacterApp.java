package Exercises.Week10.Ex04;

import java.util.List;

public class CharacterApp {
    private static List<ChractersList> chractersLists() {
        return new CharacterFile().getCharacterFile();

    }

    public static void main(String[] args) {
//How many characters appear in the books in total
        howManyCharactersAppearInTheBooksInTotal();
    }

    private static void howManyCharactersAppearInTheBooksInTotal() {
        long count = chractersLists().stream()
                .count();
        System.out.println(count);
    }


}
