package Exercises.Week02.two.Ex05a;

public class DistanceCalculator {
    public Double calculateDistance (Double steps){
        Double kilometersPerStep=0.000762;
        return steps*kilometersPerStep;
    }

}


// The DistanceCalculator has a calculateDistance
// method that receives a number of steps as Double
// and returns the distance in kilometers as Double.
