package Exercises.Week04.Ex08;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
        Optional<Box> giftbox = Optional.empty();
        System.out.println("Gift: " + giftbox);
        Box robotoy = new Box("Robotoy");
        giftbox = Optional.of(robotoy);
        System.out.println("Gift: " + giftbox);
        if (giftbox.isPresent()) {
            System.out.println("There is a present in the gift box");
        }
        Box present = giftbox.get();
        System.out.println("The " + present);
    }
}
