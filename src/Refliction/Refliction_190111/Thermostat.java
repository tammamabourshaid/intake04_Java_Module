package Refliction.Refliction_190111;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {


    private Predicate<Double>triger;
    private Function<Double,String> display;

    public String Sensor (Double Thermo, Predicate<String> condition) {

        Predicate<Double> thermoDegree = e ->e.equals(Thermo);

        if(Thermo.equals(condition)) {
            System.out.println(getThermo());
        }
        else {
        }
        return "warning";
    }
    public Thermostat(Predicate<Double> triger, Function<Double, String> display) {
        this.triger = triger;
        this.display = display;
    }

    public Predicate<Double> getTriger() {
        return triger;
    }

    public Function<Double, String> getThermo() {
        return display;
    }


    }

