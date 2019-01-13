package Exercises.Week04.Ex09;

import java.util.List;

public class LoremIpsumApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        List<String> readlines= fileReader.asLines("Exercises/Week04/Ex09/lorem-ipsum.txt");

        for (String readline : readlines) {
            System.out.println(readline);
        }
    }
}
