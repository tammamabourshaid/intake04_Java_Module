package Exercises.Week04.Ex04;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {
        Optional<String> giftbox = Optional.empty();
        System.out.println("Gift :" + giftbox);
        giftbox = Optional.of("MY Doll");
        System.out.println("Gift :" + giftbox);
        if (giftbox.isPresent()) {
            System.out.println("There is a present in the gift box");
        }
        String present = giftbox.get();
        System.out.println("The Gift is : " + present);
    }

}

//    Create the BasicGiftApplication class and write the following instructions in its main method:
//  ● Create an empty giftBox Optional of String and display it.
//  ● Assign an Optional of String to the giftBox containing an actual present and display it.
//  ● Ask if the giftBox is present and display the answer.
//  ● Get the value contained in giftBox and display it.