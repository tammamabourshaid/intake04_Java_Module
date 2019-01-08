package Exercises.Week02.two.Ex07a;

import java.util.List;

public class NumberAccumulator {
    Integer accumlate (List<Integer> numbers){
        Integer sum =0;
        for (Integer number : numbers) {
            sum+=number;

        }
        return sum;
    }
}


//One class is responsible for receiving a list of Integer
// numbers and returns an Integer that’s a sum of all of
// them. This method has a default visibility and should
// not be possible to use it from the main method.