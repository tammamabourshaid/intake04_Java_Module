package Exercises.Week08;

import Refliction.Refliction_181219.FileReader;

import java.util.List;

public class GroupEx {

    public static void main(String[] args) {
        Vortex vortex = new Vortex();
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("Exercises/Week08/participants.csv");
        for (String line : lines) {

            System.out.println(line);
        }

    }


}


