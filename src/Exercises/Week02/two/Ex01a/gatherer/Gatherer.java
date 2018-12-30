package Exercises.Week02.two.Ex01a.gatherer;

import Exercises.Week02.two.Ex01a.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {
    Scanner input = new Scanner(System.in);

    private AutomaticGatherer automaticGatherer = new AutomaticGatherer();

    public List<Hiker> signUp() {
        List<Hiker> hikers = new ArrayList<>();

        String name = askForName();
        while (!name.isEmpty()){
            Hiker hiker=new Hiker(name);
            hikers.add(hiker);
            name=askForName();
        }
        return hikers;
    }
        private String askForName () {
            System.out.println("Write your Name: ");
            return input.nextLine();
        }
    }

