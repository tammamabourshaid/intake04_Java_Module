package Refliction.Refliction_190118;

import java.util.Comparator;
import java.util.List;

public class ReflictionApplication_190118 {
    public static void main(String[] args) {

        List<Student> studentList = new StudentReader().getData();
        numberStudentPerormnce(studentList);
    }

    private static void numberStudentPerormnce(List<Student> studentList) {
        System.out.println("Total number of student performance entries: ");
        List<String> collect = studentList.stream()

                .sorted(Comparator.comparing(Student::getGender).reversed())
                .filter(e -> e.getGender().contains("female"))
                .map(e -> e.getGender());
        long total = collect.stream().distinct().count();
        System.out.println(total);
    }
}

