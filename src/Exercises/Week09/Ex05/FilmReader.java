package Exercises.Week09.Ex05;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmReader {
    private FileReader reader = new FileReader();

    public List<Film> getFilms() {
        List<Film> asStream = getFilmasStream()
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Film(e[8], Double.valueOf(e[9]), Integer.valueOf(e[10]), Integer.valueOf(e[6]),
                        Integer.valueOf(e[0]), Long.valueOf(e[5])))
                .collect(Collectors.toList());

        return asStream;
    }

    private Stream<String> getFilmasStream() {
        return reader.asStream("Exercises/Week09/Ex05/films.csv");
    }

}
