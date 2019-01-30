package Exercises.Week11.Ex02;

import java.util.Scanner;

public class MilitaryTimeToOrdinary {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter military Time (hhmm) : ");
        int time = in.nextInt();
        System.out.println("Ordinary Time: " +militaryToOrdinaryTime(time));
    }
    public static String militaryToOrdinaryTime(int milTime)
        {
            int hour = milTime / 100;
            int min = milTime%100;
            String period;
            if (hour < 0 || hour > 24 || min < 0 || min > 59) {
                return "";
            } else if (hour > 12) {
                hour = hour - 12;
                period = "PM";
            } else {
                period = "AM";
            } if (hour == 0) {
                hour = 12;
            } else if (min == 0) {
                String ordTime = hour + " " + period;
                return ordTime;
            } else if (min < 10 && min > 0) {
            } String ordTime = hour + ":" + min + " " + period;
            return ordTime;
        }
    }

