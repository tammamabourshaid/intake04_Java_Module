package Exercises.Week09.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int number = 1; number <= 20; number++) {
            numbers.add(number);
        }
        System.out.println(numbers);

        List<Integer> evennumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evennumbers);

        List<Integer> oddnumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddnumbers);

        List<Integer> dividedonthree = numbers.stream()
                .filter(number -> (number % 3 == 0) && (number > 10))
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10 : " + dividedonthree);

        List<Integer> smallerthanfive = numbers.stream()
                .filter(number -> number < 5)
                .map(number -> number * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3: " + smallerthanfive);

        List<Integer> biggerThanAndSmaller = numbers.stream()
                .filter(number -> number > 8 && number < 12)
                .collect(Collectors.toList());

        biggerThanAndSmaller.stream()
                .forEach(number -> System.out.println("number " + number + " has " + String.valueOf(number).length() + " digits"));

    }

}