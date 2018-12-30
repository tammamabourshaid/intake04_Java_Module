package Exercises.Week02.two.Ex05a;

import java.util.List;

public class PedometerApplication {
    public static void main(String[] args) {
        StepGatherer stepGatherer = new StepGatherer();
        List<Integer> stepsFromEveryone = stepGatherer.gatherSteps();
        AverageCalculator averageCalculator = new AverageCalculator();
        Double averageNumberofSteps=averageCalculator.calculateAverage(stepsFromEveryone);
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        Double averageDistance=distanceCalculator.calculateDistance(averageNumberofSteps);
        System.out.println("The average distance is: "+ averageDistance+"kilometers");

    }
}

//  The PedometerApplication has the main method
//  and uses the other classes.
