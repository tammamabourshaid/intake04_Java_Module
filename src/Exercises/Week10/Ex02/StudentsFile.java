package Exercises.Week10.Ex02;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsFile {

    private FileReader reader = new FileReader();

    public List<StudentsList> getStudent() {
        return reader.asStream("Exercises/Week10/Ex02/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(columns -> new StudentsList(columns[0], columns[1],
                        Integer.valueOf(columns[2]), Integer.valueOf(columns[3]),
                        Integer.valueOf(columns[4])))
                .collect(Collectors.toList());


    }
}
