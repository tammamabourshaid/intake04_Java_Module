package Exercises.Week09.Ex05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {

    public static void main(String[] args) {
        List<Film> films = new FilmReader().getFilms();

        ThreeFilmsHighstRated(films);
//        ThreeFilmsHighstRated();


        ThreeFilmsLonger3Hour(films);
//        ThreeFilmsLonger3Hour();

//        FourFilmsbyBudget();

//        FourExpensiveShorterThan90Minutes();

        TopAndBetween(films);



    }

    private static void ThreeFilmsHighstRated(List<Film> films) {
        System.out.println("Top 3 with highest rating, sorted by rating: ");
        List<String> collect = films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void ThreeFilmsHighstRated() {
        FilmReader filmReader = new FilmReader();
        System.out.println("Top 3 with highest rating, sorted by rating: ");
        filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(e -> e.getTitle())
                .forEach(e-> System.out.println(e));

    }

    private static void ThreeFilmsLonger3Hour(List<Film> filmreader) {
        System.out.println("\nTop 3 with highest rating longer than 3 hours, sorted by rating: ");

        List<String> collect= filmreader.stream()
        .filter(e -> e.getRuntime() > 180)
        .sorted(Comparator.comparing(Film::getScore).reversed())
        .limit(3)
        .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println(collect);
    }







    public static void ThreeFilmsLonger3Hour() {
        FilmReader filmReader = new FilmReader();
        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating: ");
        filmReader.getFilms().stream()
                .filter(e -> e.getRuntime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getTitle()));

    }

    public static void FourFilmsbyBudget() {
        FilmReader filmReader = new FilmReader();
        System.out.println("Top 4 most expensive, sorted by budget: ");
        filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .forEach(e -> System.out.println(e.getTitle()));
    }

    public static void FourExpensiveShorterThan90Minutes() {
        FilmReader filmReader = new FilmReader();
        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget: ");
        filmReader.getFilms().stream()
                .filter(e -> e.getRuntime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getTitle()));
    }

    private static void TopAndBetween(List<Film> film) {
        System.out.println("\nTop 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget :");

        List<String> collect = film.stream()
                .filter(e -> e.getScore() > 7)
                .filter(e -> e.getBudget() > 50000
                        && e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}