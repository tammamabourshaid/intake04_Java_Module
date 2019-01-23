package Exercises.Week10.Ex02;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsPerformance {

    private static List<StudentsList> studentsLists = readStudentFile();

    public static void main(String[] args) {

        parentEduLevApperance();

        parentEduLevApperanceSortedTopBottom();

        numbreOfStudentsWithHighEduandLowerthan60();

        genderAndAvgScoresTopAvrg();

        studentWithParentEduHighSchoolHas95EachTopic();


    }

    private static void parentEduLevApperance() {
        System.out.println("Parent education level appearances:");

        Map<String, Long> parentEduLevApperance = studentsLists.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(parentEduLevApperance);
    }

    private static void parentEduLevApperanceSortedTopBottom() {
        System.out.println("\nParent education level appearances sorted top bottom:");

        studentsLists.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .forEach(e -> System.out.println(e));
    }

    private static void numbreOfStudentsWithHighEduandLowerthan60() {
        System.out.println("\nNumber of students with high parent education and lower scores than 60:");
        long numberOfStudentWithHighEduandLowerthan60 = studentsLists.stream()
                .filter(e -> e.getParentalLevelOfEducation().equalsIgnoreCase("master's degree"))
                .filter(e -> e.getMathScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getWritingScore() < 60)
                .count();
        System.out.println(numberOfStudentWithHighEduandLowerthan60);

    }

    private static void genderAndAvgScoresTopAvrg() {
        System.out.println("\nGenders and average scores of the top four average score students:");
        studentsLists.stream()
                .map(e -> ((e.getReadingScore() + e.getMathScore() + e.getWritingScore()) / 3) + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(4)

                .forEach(e -> System.out.println(e));
    }

    private static void studentWithParentEduHighSchoolHas95EachTopic() {
        System.out.println("\nIs there any student with a parent education level of some high school that has at least" +
                " 95 in every topic");
        boolean some_high_school = studentsLists.stream()
                .filter(e -> e.getParentalLevelOfEducation().equalsIgnoreCase("some high school"))
                .anyMatch(e -> e.getMathScore() > 95 && e.getWritingScore() > 95 && e.getReadingScore() > 95);
        System.out.println(some_high_school);
    }

    private static List<StudentsList> readStudentFile() {
        return new StudentsFile().getStudent();
    }


}


