package Exercises.Week02.Ex06a;

import java.util.Scanner;

public class CoordinateGatherer {
    private Scanner input= new Scanner(System.in);

    public Coordinate gatherCoordinate(){
        System.out.println("Write the latitude :");
        double latitude= input.nextDouble();
        System.out.println("Write the longitude :");
        double longitude= input.nextDouble();
        return new Coordinate(latitude,longitude);
    }
}
