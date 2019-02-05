package Exercises.Week11.Ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimplifyDirections {
    public static void main(String[] args) {
        List<String> directions = Arrays.asList("NORTH", "EAST", "WEST", "SOUTH", "SOUTH", "WEST");
        System.out.println(deletOppositeDirections(directions));
    }
    static   public List<String> deletOppositeDirections(List<String> directions) {
        String direction = directions.stream().map(e->e+",").collect(Collectors.joining());
        Integer directionLength = direction.length();
        while (directionLength!=getLeftDirections(direction).length()){
            direction=  getLeftDirections(direction);
            directionLength = direction.length();
        }
        List<String>finalDirectionsList=Arrays.asList(direction.split(","))
                ;
        return finalDirectionsList ;
    }
    static private String getLeftDirections(String direction) {
        String finalDirection=    direction.replaceAll("NORTH,SOUTH,", "").replaceAll("SOUTH,NORTH,", "")
                .replaceAll("EAST,WEST,", "").replaceAll("WEST,EAST,", "");
        return finalDirection;
    }
}

