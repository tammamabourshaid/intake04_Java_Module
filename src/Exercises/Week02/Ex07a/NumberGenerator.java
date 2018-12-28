package Exercises.Week02.Ex07a;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

List<Integer> generate550numbers(){
    List<Integer> number550=new ArrayList<>();
    for (int times = 1; times <=2 ; times++) {
        number550.add(times);

    }
    return number550;
}
}


//One class is responsible for providing a list of the
// first 550 Integer numbers. This method has a default
//visibility and should not be possible to use it from
// the main method.