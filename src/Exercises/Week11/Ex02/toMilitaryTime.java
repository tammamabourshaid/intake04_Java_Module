package Exercises.Week11.Ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class toMilitaryTime {
//    Write the method ​ toMilitaryTime ​ , that receives a String representing a time in 12-hour format
//    and returns a String representing that time in 24-hour format. Have in mind that
//    midnight is 12:00:00 AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Also that noon
//    is 12:00:00 PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

    public static void main(String[] args) {
        String input = "07:05:45 PM";
        //Format of the date defined in the input String
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try {
            //Converting the input String to Date
            date = dateFormat.parse(input);
            //Changing the format of date and storing it in String
            output = outputformat.format(date);
            //Displaying the date
            System.out.println(output);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}

