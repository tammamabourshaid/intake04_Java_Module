package Exercises.Week04.got;


import Exercises.Week04.Ex09.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterReader {

    private FileReader reader = new FileReader();

    public List<Character> asList(String filePath) {
        List<String> lines = reader.asLines(filePath);
        removeHeader(lines);
        return toCharacters(lines);
    }

    private void removeHeader(List<String> lines) {
        lines.remove(0);
    }

    private List<Character> toCharacters(List<String> lines) {
        List<Character> characters = new ArrayList<>();
        for (String line : lines) {
            characters.add(toCharacter(line));
        }
        return characters;
    }

    private Character toCharacter(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String bookOfDeath = columns.get(3);
        String gender = columns.get(6);
        if (gender.equals("1")) {
            gender = "man";
        } else {
            gender = "woman";
        }
        return new Character(name, bookOfDeath, gender);
    }

}
