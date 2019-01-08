package Refliction.Refliction_181123.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {
    public Integer mirror(Integer number) {
        List<String> numbers = separate(number);
        Collections.reverse(numbers);
        String reversedNumber = String.join("", numbers);
        return Integer.valueOf(reversedNumber);
    }

    private List<String> separate(Integer number) {
        String string = number.toString();
        String[] split = string.split("");
        List<String> immutableNumbers = Arrays.asList(split);
        List<String> multableNumbers = new ArrayList<>(immutableNumbers);
        return multableNumbers;
    }


}
