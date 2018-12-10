package Exercises.Week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = getSeveralNumbers();
        List<Integer> reversed = reverse(numbers);
        System.out.println(numbers);
        System.out.println(reversed);
    }

    public static List<Integer> getSeveralNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        Integer size = numbers.size();
        if (size == 0) {
            return new ArrayList<>();
        }
        List<Integer> reversed = new ArrayList<>();
        for (int position = size - 1; position >= 0; position--) {
            Integer number = numbers.get(position);
            reversed.add(number);
        }
        return reversed;
    }
}

