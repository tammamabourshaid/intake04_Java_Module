package Refliction.Refliction_181130;

import java.util.*;

public class RobodogApplication {


    public static void main(String[] args) {
        FileReader reader = new FileReader();
        readDocument(reader);

    }

    private static void readDocument(FileReader reader) {
        List<String> lines = reader.gettext("Refliction_181130/robodog.txt");
        for (String line : lines) {
            System.out.println(line.replaceAll("!",""));

        }


        Set<String> readTheFIle = new HashSet<>();
        readTheFIle.add("bark");
        readTheFIle.add("move right");
        readTheFIle.add("step backwards");
        readTheFIle.add("move left");
        readTheFIle.add("step forward");


        System.out.println("Number of unique instructions: " + readTheFIle.size());
        System.out.println("Commands:" + readTheFIle);

    }
}