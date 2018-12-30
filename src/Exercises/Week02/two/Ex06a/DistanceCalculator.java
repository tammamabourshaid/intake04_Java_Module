package Exercises.Week02.two.Ex06a;

public class DistanceCalculator {

    public Double calculateDistance(Coordinate coordinate1,Coordinate coordinate2) {
        Double x1 = coordinate1.getLatitude();
        Double y1 = coordinate1.getLongitude();
        Double x2 = coordinate2.getLatitude();
        Double y2 = coordinate2.getLongitude();
        Double radiusOfTheEarth = 6371.01;
        Double sin = Math.sin(x1) * Math.sin(x2);
        Double cos = Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        Double arcos = Math.acos(sin + cos);
return radiusOfTheEarth*arcos;
    }
}
