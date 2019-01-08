package Exercises.Week02.two.Ex05a;

import java.util.List;

public class AverageCalculator {

    private List<Integer> steps;

    public Double calculateAverage(List<Integer> steps) {
        this.steps = steps;
        Integer sum = 0;
        for (Integer step : steps) {
            sum += step;
        }
        Double average = sum / (double) steps.size();
        return average;
    }
}


// The AverageCalculator has a calculateAverage
// method that receives a list of Integer
// and returns a Double that is the average.
