package Refliction.Refliction_190201;

import java.time.LocalDate;
import java.time.Period;

public class Solstices {


    public String getSummerSolsticeCountdown(String countdownMessage) {

         LocalDate inputdate = LocalDate.parse("2019-02-01");


        LocalDate firstdate = LocalDate.parse("2019-06-21");
        LocalDate seconddate = LocalDate.parse("2020-06-20");
        LocalDate thirddate = LocalDate.parse("2022-06-21");
        LocalDate forthdate = LocalDate.parse("2023-06-21");

        Period between = Period.between(inputdate, firstdate);
        System.out.println(between.getMonths());


        return countdownMessage;

    }

    public String getWinterSolsticeCountdown(String countdownMessage) {

        LocalDate inputdate = LocalDate.parse("2019-02-01");

        LocalDate firstdate = LocalDate.parse("2019-12-22");
        LocalDate seconddate = LocalDate.parse("2020-12-21");
        LocalDate thirddate = LocalDate.parse("2022-12-21");
        LocalDate forthdate = LocalDate.parse("2023-12-22");

        Period.between(inputdate, firstdate);
        return countdownMessage;
    }


}


