package Exercises.Week06.Ex02.competitor;

import Exercises.Week06.Ex02.ConeIceCream;
import Exercises.Week06.Ex02.CupIceCream;
import Exercises.Week06.Ex02.IceCream;

public class CompetitorIceCreamApplication {

    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Peach", "Nuts");
//        cone.getFlavor()
//        cone.getTopping()
//        it doesn't work
        IceCream cup = new CupIceCream("Strawberry", "Pistachio");
//        cup.getFlavor()
//        cup.getTopping()
//        it doesn't work
    }

}
