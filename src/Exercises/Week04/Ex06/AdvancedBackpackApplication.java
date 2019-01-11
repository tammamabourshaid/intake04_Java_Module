package Exercises.Week04.Ex06;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {

    public static void main(String[] args) {
        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        Item underwear = new Item("underwear");
        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        backpack.add(underwear);
        backpack.add(underwear);
        backpack.add(toothpaste);
        backpack.add(towel);
        System.out.println("Backpack: " + backpack);
        Item anotherUnderwear = new Item("underwear");
        if (backpack.contains(anotherUnderwear)) {
            System.out.println("The backpack contains underwaer");
            backpack.remove(anotherUnderwear);
            System.out.println(backpack);
    if (!backpack.contains(anotherUnderwear)){
        System.out.println("The backpack not contains underwaer");
    backpack.add(towel);
    backpack.add(towel);
        System.out.println("Backpack Size: "+ backpack.size());
    }
        }

    }
}

