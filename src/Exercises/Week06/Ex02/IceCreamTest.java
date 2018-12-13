package Exercises.Week06.Ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IceCreamTest {

    @Test
    void testConeIceCream() {
        IceCream cone = new ConeIceCream("Chocolate", "Oreo");

        String expected = "The Chocolate ice-cream with Oreo is licked";

        Assertions.assertEquals(expected, cone.eat());
    }

    @Test
    void testCupIceCream() {
        IceCream cup = new CupIceCream("Vanilla", "Cookies");

        String expected = "The Vanilla ice-cream with Cookies is eaten with a spoon";

        Assertions.assertEquals(expected, cup.eat());
    }
}