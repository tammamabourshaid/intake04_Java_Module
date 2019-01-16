package Exercises.Week09.Ex05;

import java.util.Comparator;

public class FilmSummarizer {

    public static void main(String[] args) {

        ThreeFilmsHighstRated();

    }

    public static void ThreeFilmsHighstRated() {
        FilmReader filmReader = new FilmReader();
        filmReader.getFilms().stream()
                .limit(3)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .forEach(e -> System.out.println("Top 3 with highest rating, sorted by rating: " + e.getTitle()));

    }

}
