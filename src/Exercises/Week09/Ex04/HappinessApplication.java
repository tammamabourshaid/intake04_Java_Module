package Exercises.Week09.Ex04;

import Exercises.Week09.Ex02.FileReader;

import java.util.Comparator;

public class HappinessApplication {
    public static void main(String[] args) {
        new FileReader().asStream("Exercises/Week09/Ex04/world-happiness-2017.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(line -> new HappinessRecord(Integer.valueOf(line[1]), line[0], Double.valueOf(line[2])))
                .sorted(Comparator.comparing(e -> e.getRank()))
                .limit(5)
                .map(e->"Rank: " + e.getRank() +"  |  " + "Country: " + e.getCountry() + "  |  " + "Score: " +e.getScore())
                .forEach(e-> System.out.println(e));

    }
}
