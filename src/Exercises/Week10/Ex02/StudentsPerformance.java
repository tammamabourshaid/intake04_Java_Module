package Exercises.Week10.Ex02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsPerformance {
    private static List<StudentsList> studentsLists = readStudentFile();

    public static void main(String[] args) {
        System.out.println("Parent education level appearances:");
        Map<String, Long> parentEduLevApperance = studentsLists.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(parentEduLevApperance);

        System.out.println("\nParent education level appearances sorted top bottom:");
        studentsLists.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .forEach(e -> System.out.println(e));

        System.out.println("\nNumber of students with high parent education and lower scores than 60:");
//        studentsLists.stream()

    }

    private static List<StudentsList> readStudentFile() {
        return new StudentsFile().getStudent();
    }


}


