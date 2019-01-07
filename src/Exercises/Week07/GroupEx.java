package Exercises.Week07;

import Refliction.Refliction_181219.FileReader;

import java.util.List;

public class GroupEx {

    public static void main(String[] args) {
        Vortex vortex = new Vortex();
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("Exercises/Week07/participants.csv");
        for (String line : lines) {

            System.out.println(line);
        }

    }


}


