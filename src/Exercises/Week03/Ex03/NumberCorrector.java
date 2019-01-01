package Exercises.Week03.Ex03;

public class NumberCorrector {

    public Integer correct(Double number) {

        number = Math.abs(number);
        number = Math.floor(number);
        int correctedNumber = number.intValue();
        return correctedNumber;
    }

}

//    The NumberCorrector class has no attributes.
//    It has the correct method that receives a Double
//    and returns the Integer version of it in absolute terms.