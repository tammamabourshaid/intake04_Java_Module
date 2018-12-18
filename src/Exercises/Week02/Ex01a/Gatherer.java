package Exercises.Week02.Ex01a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

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
            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }
    }

