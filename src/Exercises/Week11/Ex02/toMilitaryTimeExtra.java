package Exercises.Week11.Ex02;

import java.util.Scanner;

public class toMilitaryTimeExtra {
    public static void main(String[] args) {
        System.out.println("Intput example (07:05:45PM)");
        Scanner yo = new Scanner(System.in);
        String time_in_12 = yo.nextLine();
        String[] tokens = time_in_12.split(":");
        String time_in_24 = "";
        String am_pm = tokens[2];
        if (tokens[2].endsWith("PM")) {
            if (tokens[0].equals("12")) {
                time_in_24 += tokens[0];
            } else {
                time_in_24 += (Integer.parseInt(tokens[0]) + 12) % 24;
            }

        } else {
            time_in_24 += tokens[0];
        }
        if (tokens[2].endsWith("PM")) {
            tokens[2] = tokens[2].replace("PM", "");
        } else {
            tokens[2] = tokens[2].replace("AM", "");
        }
        if (tokens[0].equals("12") && am_pm.endsWith("AM")) {
            time_in_24 = "00:" + tokens[1] + ":" + tokens[2];
        } else {
            time_in_24 += ":" + tokens[1] + ":" + tokens[2];
        }
        System.out.println(time_in_24);

    }
}

