package Exercises.Week02.two.Ex06a;

public class DistanceApplication {
    public static void main(String[] args) {
        CoordinateGatherer gatherer = new CoordinateGatherer();
        Coordinate coordinate1=gatherer.gatherCoordinate();
        Coordinate coordinate2=gatherer.gatherCoordinate();
        DistanceCalculator calculator=new DistanceCalculator();
        System.out.println("Calculating..");
        Double distance = calculator.calculateDistance(coordinate1,coordinate2);
        System.out.println("The distance between Points is: "+ distance+"km");
    }
}
