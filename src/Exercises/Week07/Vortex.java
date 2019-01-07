package Exercises.Week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vortex {
    public Integer toVortex(String name){
        List<Integer> numbers = new ArrayList<>();
        String[] split = name.split("");
        List<String> letters = Arrays.asList(split);
        for (String letter : letters) {
            int number = (char) letter.charAt(0);
            numbers.add(number);
        }
        Integer sum=0;
        for (Integer number : numbers) {
           sum+=number;
        }
        return sum;
    }
}
