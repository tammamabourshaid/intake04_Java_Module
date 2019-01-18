package Refliction.Refliction_190118;

import Exercises.Week09.Ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentPerformance {

    public static class StudentsPerformanceApp {

        public static void main(String[] args) {
            List<String> entries = readStudentPerformanceEntries();
            System.out.println("Total number of student performance entries: " + entries.size());
            displayNumberOfBoysAndGirls(entries);
            displayDistinctParentalEducationLevelsSortedAlphabetically(entries);
            displayNumberOfStudentsWithScoresHigherThan90(entries);
            displayBestStudents(entries);
        }

        private static List<String> readStudentPerformanceEntries() {
            FileReader reader = new FileReader();
            return reader.asStream("Refliction/Refliction_190118/students-performance.csv")
                    .skip(1)
                    .collect(Collectors.toList());
        }

        private static void displayNumberOfBoysAndGirls(List<String> students) {
            long females = students.stream()
                    .map(e -> e.split(";"))
                    .filter(e -> e[0].contains("female"))
                    .count();
            long males = students.size() - females;
            System.out.println("Number of female students: " + females);
            System.out.println("Number of male students: " + males);
        }

        private static void displayDistinctParentalEducationLevelsSortedAlphabetically(List<String> entries) {
            List<String> educationLevels = entries.stream()
                    .map(e -> e.split(";"))
                    .map(e -> e[1])
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Parental education levels sorted alphabetically:");
            System.out.println(educationLevels);
        }


        private static void displayNumberOfStudentsWithScoresHigherThan90(List<String> entries) {
            int topScore = 90;
            long topStudents = entries.stream()
                    .map(e -> e.split(";"))
                    .filter(e -> Integer.valueOf(e[2]) > topScore)
                    .filter(e -> Integer.valueOf(e[3]) > topScore)
                    .filter(e -> Integer.valueOf(e[4]) > topScore)
                    .count();
            System.out.println("Number of students with scores higher than 90: " + topStudents);
        }

        private static void displayBestStudents(List<String> entries) {
            int topScore = 100;
            List<String> topStudents = entries.stream()
                    .map(e -> e.split(";"))
                    .filter(e -> Integer.valueOf(e[2]) == topScore)
                    .filter(e -> Integer.valueOf(e[3]) == topScore)
                    .filter(e -> Integer.valueOf(e[4]) == topScore)
                    .map(e -> e[0])
                    .collect(Collectors.toList());
            System.out.println("Number of students with scores equal to 100: " + topStudents.size());
            System.out.println("Genders of these students are: " + topStudents);
        }
    }


}
