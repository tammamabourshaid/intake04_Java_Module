package Exercises.Week11.Ex02;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class toMilitaryTimeEasy {
    public static void main(String[] args) {
        toMilitary("09:05:45PM");
    }

    private static void toMilitary(String time) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        System.out.println(localTime.format(formatter));
    }

}
