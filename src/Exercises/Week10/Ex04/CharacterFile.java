package Exercises.Week10.Ex04;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterFile {
    private FileReader reader = new FileReader();

    public List<ChractersList> getCharacterFile() {
        return reader.asStream("Exercises/Week10/Ex04/got-characters.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(column -> new ChractersList(column[0], column[1], String.valueOf(column[2]),
                        String.valueOf(column[3]), String.valueOf(column[4]),
                        String.valueOf(column[5]), Integer.valueOf(column[6]),
                        Integer.valueOf(column[7]), Integer.valueOf(column[8]), Integer.valueOf(column[9])
                        , Integer.valueOf(column[10]), Integer.valueOf(column[11]), Integer.valueOf(column[12])))
                .collect(Collectors.toList());
    }
}
