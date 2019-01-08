package Exercises.Week04.Ex02;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        Set<String> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        String underwear = "underwear";
        String toothpaste = "toothpaste";
        String towel = "underwear";
        backpack.add(underwear);
        backpack.add(toothpaste);
        backpack.add(towel);
        System.out.println("Backpack: " + backpack);
        if (backpack.contains("underwear")) {
            System.out.println("The backpack contains underwear");
        }
        backpack.remove("underwear");
        System.out.println("Backpack: " + backpack);
        if (!backpack.contains("underwear")) {
            System.out.println("The Backpack no longer contains Underwear");
        }
        backpack.add(toothpaste);
        backpack.add(toothpaste);
        System.out.println("Backpack: " + backpack);
        System.out.println("Backpack: " + backpack);
        System.out.println("Backpack: " + backpack.size());
        System.out.println("Backpack toothpaste: " + backpack.contains("toothpaste"));
        System.out.println("Backpack towel: " + backpack.contains("towel"));
        System.out.println("Backpack underwear: " + backpack.contains("underwear"));
    }
}

//Hansel is preparing himself for a trip and wants to make sure
// he has packed at least one of everything.
// Create the BasicBackpackApplication class and write the following
// instructions in its main method:
// ● Create an empty backpack set and display it.
// ● Create three Strings that represent three different items.
// ● Add them to the backpack set and display it.
// ● Ask if one of them is contained in the set and display the answer.
// ● Remove one of them by providing its name as an argument and display the set.
// ● Ask if the element you just removed is not contained in the
// set and display the answer.
// ● Add one of the existing items twice and display the set.
// ● Display its size.