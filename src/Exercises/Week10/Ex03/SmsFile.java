package Exercises.Week10.Ex03;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsFile {

    private FileReader reader = new FileReader();

    public List<SmsList> getSmsFile() {
        return reader.asStream("Exercises/Week10/Ex03/sms.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(column -> new SmsList(column[0], column[1]))
                .collect(Collectors.toList());
    }
}
