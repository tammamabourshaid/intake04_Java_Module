package Refliction.Refliction_190118;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentReader {

    private FileReader reader = new FileReader();

    public List<Student> getData() {
        List<Student> asStream = getStudentsdata()
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Student(e[0], e[1], Integer.valueOf(e[2]), Integer.valueOf(e[3]),
                        Integer.valueOf(e[4])))
                .collect(Collectors.toList());

        return asStream;
    }

    private Stream<String> getStudentsdata() {
        return reader.asStream("Refliction/Refliction_190118/students-performance.csv");
    }

}
