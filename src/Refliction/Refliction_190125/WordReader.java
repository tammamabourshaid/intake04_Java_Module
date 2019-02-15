package Refliction.Refliction_190125;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordReader {

    public List<String> getWords(String filePath) {
        return new FileReader().asStream(filePath)
                .map(e -> e.toLowerCase())
                .map(e -> e.replaceAll(",", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll("’s", " "))
                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll("‘", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll("/", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.replaceAll("\\.", " "))
                .map(e -> e.replaceAll("\\*", " "))
                .map(e -> e.replaceAll("\\(", " "))
                .map(e -> e.replaceAll("\\)", " "))
                .map(e -> e.replaceAll("\\[", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e->e.split(" "))
                .flatMap(e->Stream.of(e))
                .filter(e->!e.isEmpty())
                .collect(Collectors.toList());

    }

}
