package Exercises.Week10.Ex01;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonFile {

    private FileReader reader = new FileReader();

    public List<PokemonList> getPokemon(String filePath) {
        return reader.asStream(filePath)
                .skip(1)
                .map(e -> e.split(";"))
                .map(columns -> new PokemonList(columns[1], columns[2], columns[3],
                        Integer.valueOf(columns[4]), Integer.valueOf(columns[5]), Integer.valueOf(columns[6]),
                        Integer.valueOf(columns[7]), Integer.valueOf(columns[8]),
                        Integer.valueOf(columns[9]), Integer.valueOf(columns[10]),
                        Integer.valueOf(columns[11]), Boolean.valueOf(columns[12])))
                .collect(Collectors.toList());

    }

//    private Stream<String> getPokemonFile() {
//        return reader.asStream("Exercises/Week10/Ex01/pokemon.csv");
//    }
}







