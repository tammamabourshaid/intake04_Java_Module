package Exercises.Week08;


import Refliction.Refliction_181219.FileReader;

import java.util.List;

public class SensorApplication {


    public static void main(String[] args) {
        readLines();

    }

    public static List<String> readLines() {
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("Exercises/Week08/robomime.txt");
        for (String line :lines) {
//         String name = line.replaceAll("!", "");
line = line.replaceAll("!","");
//line = line.replaceAll("&","");
//line = line.replaceAll("#","");
//line = line.replaceAll("robomime","");
            lines.add(line);
            System.out.println(line);
        }
        return lines;
    }
}










